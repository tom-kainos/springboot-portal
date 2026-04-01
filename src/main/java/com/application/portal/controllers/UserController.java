package com.application.portal.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.application.portal.models.User;
import com.application.portal.repositories.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class UserController {
    
    private final UserRepository userRepository;

    UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/api/users")
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
    
}
