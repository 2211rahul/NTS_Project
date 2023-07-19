package LoginAuth.LoginSignup.Controller;

import LoginAuth.LoginSignup.Service.IUserService;
import LoginAuth.LoginSignup.entites.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/urbanstay")
public class UserController {

    @Autowired(required = true)
    private IUserService userService;

    @GetMapping("/msg")
    public String displayNts(){
        return "Hello";
    }
    @PostMapping("/newuser")
    public ResponseEntity<User> addNewUser(@RequestBody User user)
    {

        System.out.println(user);
        User u = userService.insertNewUser(user);
        return ResponseEntity.ok(u);
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers()
    {
        List<User> userList = userService.getAllUsers();
        return ResponseEntity.ok(userList);
    }




}
