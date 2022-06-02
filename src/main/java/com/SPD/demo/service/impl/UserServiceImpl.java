package com.SPD.demo.service.impl;

import com.SPD.demo.model.User;
import com.SPD.demo.repository.UserRepository;
import com.SPD.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();

    }
}
