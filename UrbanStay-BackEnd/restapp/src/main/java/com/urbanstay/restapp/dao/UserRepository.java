package com.urbanstay.restapp.dao;

import com.urbanstay.restapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    public User findByMobileAndPassword(String mobile,String password);
}
