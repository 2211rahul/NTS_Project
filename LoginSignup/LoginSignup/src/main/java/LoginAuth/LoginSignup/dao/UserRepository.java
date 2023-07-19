package LoginAuth.LoginSignup.dao;

import LoginAuth.LoginSignup.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {


    User findByMobileAndPassword(String mobile, String password);
}
