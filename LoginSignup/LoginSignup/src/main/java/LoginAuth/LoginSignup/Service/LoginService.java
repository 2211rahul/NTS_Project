package LoginAuth.LoginSignup.Service;

import LoginAuth.LoginSignup.dao.LoginRepository;
import LoginAuth.LoginSignup.entites.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements ILoginService{
    @Autowired
    private LoginRepository loginRepository;

    @Autowired
    private IUserService userService;

    @Override
    public User verifyLogin(String mobile, String password) {
        User user = userService.getByMobileAndPassword(mobile,password);
        if(user != null)
        {
            return user;
        }
        else {
            return null;
        }
    }
}
