package com.application.portal.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.application.portal.models.User;
import com.application.portal.repositories.UserRepository;

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

    @GetMapping("/api/users/role")
    public Iterable<User> getUsersByRole(@RequestParam String role) {
        return userRepository.findUsersByRole(role);
    }
    
}
