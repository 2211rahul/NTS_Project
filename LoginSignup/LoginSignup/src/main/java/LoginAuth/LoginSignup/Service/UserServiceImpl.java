package LoginAuth.LoginSignup.Service;

import LoginAuth.LoginSignup.dao.UserRepository;
import LoginAuth.LoginSignup.entites.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService{

    @Autowired(required = true)
    private UserRepository userRepo;
    @Override
    public User insertNewUser(User user) {

        userRepo.save(user);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> userList = userRepo.findAll();
        return userList;
    }

    @Override
    public User getByMobileAndPassword(String mobile, String password) {
        return userRepo.findByMobileAndPassword(mobile,password);
    }
}
