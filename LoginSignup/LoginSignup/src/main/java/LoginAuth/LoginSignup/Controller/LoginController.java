package LoginAuth.LoginSignup.Controller;

import LoginAuth.LoginSignup.Service.ILoginService;
import LoginAuth.LoginSignup.entites.Login;
import LoginAuth.LoginSignup.entites.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/urbanstay")
public class LoginController {
    @Autowired
    ILoginService loginService;



    @PostMapping("/loginuser")
    public ResponseEntity<User> loginUser(@RequestBody Login login)
    {
        System.out.println(" In login "+login);

        User user = loginService.verifyLogin(login.getMobile(), login.getPassword());
        System.out.println(user);

        if(user != null)
        {
            return ResponseEntity.ok(user);
        }
        else
        {
            return ResponseEntity.ok(null);
        }
    }
}
