package com.project.agriculture.services;

import com.project.agriculture.model.UserModel;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


public interface UserService {
    UserModel saveUser(UserModel user);
    UserModel loadUserByUsername(String username);
} 