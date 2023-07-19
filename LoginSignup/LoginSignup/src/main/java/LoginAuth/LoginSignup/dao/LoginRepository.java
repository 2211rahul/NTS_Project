package LoginAuth.LoginSignup.dao;

import LoginAuth.LoginSignup.entites.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login,Integer> {

}
