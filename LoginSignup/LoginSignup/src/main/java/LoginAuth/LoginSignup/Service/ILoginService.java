package LoginAuth.LoginSignup.Service;

import LoginAuth.LoginSignup.entites.User;

public interface ILoginService {

    User verifyLogin(String mobile, String password);
}
