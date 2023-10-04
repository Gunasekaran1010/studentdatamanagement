package com.example.SchoolMagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SchoolMagement.model.User;
import com.example.SchoolMagement.repositery.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
