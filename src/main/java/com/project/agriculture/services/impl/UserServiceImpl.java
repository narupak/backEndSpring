package com.project.agriculture.services.impl;

import com.project.agriculture.entity.User;
import com.project.agriculture.model.UserModel;
import com.project.agriculture.repository.UserRepository;
import com.project.agriculture.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired 
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder bcryptEncoder;
    
    @Override
    public UserModel saveUser(UserModel user) {
        User userEn = userRepository.save(mapModeltoEntity(user));
        return mapEntitytoModel(userEn);
    }

    public User mapModeltoEntity(UserModel user){
        User User = new User();
        User.setUsername(user.getUsername());
        User.setPassword(bcryptEncoder.encode(user.getPassword()));
        User.setEmail(user.getEmail());
        User.setTel(user.getTel());
        User.setFirstName(user.getFirstName());
        User.setLastName(user.getLastName());
        return User;
    }

    public UserModel mapEntitytoModel(User userEn){
        UserModel userModel = new UserModel();
        userModel.setUsername(userEn.getUsername());
        userModel.setPassword(userEn.getPassword());
        userModel.setEmail(userEn.getEmail());
        userModel.setTel(userEn.getEmail());
        userModel.setFirstName(userEn.getFirstName());
        userModel.setLastName(userEn.getLastName());
        return userModel;
    }

    @Override
    public UserModel loadUserByUsername(String username) throws UsernameNotFoundException{
        // TODO Auto-generated method stub
        if(("javaSenz".equals(username))){
            return mapEntitytoModel(userRepository.findByUsername(username));
        }else{
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }
}