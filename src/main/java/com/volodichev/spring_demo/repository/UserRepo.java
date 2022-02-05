package com.volodichev.spring_demo.repository;

import com.volodichev.spring_demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {
}
