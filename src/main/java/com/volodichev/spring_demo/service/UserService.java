package com.volodichev.spring_demo.service;

import com.volodichev.spring_demo.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
}
