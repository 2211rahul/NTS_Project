package LoginAuth.LoginSignup.Service;



import LoginAuth.LoginSignup.entites.User;

import java.util.List;

public interface IUserService {


    User insertNewUser(User user);

    List<User> getAllUsers();

    User getByMobileAndPassword(String mobile, String password);
}
