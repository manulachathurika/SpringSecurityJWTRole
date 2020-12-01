package com.manula.springrolejwt.service;

import java.util.List;

import com.manula.springrolejwt.model.User;
import com.manula.springrolejwt.model.UserDto;

public interface UserService {
    User save(UserDto user);
    List<User> findAll();
    User findOne(String username);
}
