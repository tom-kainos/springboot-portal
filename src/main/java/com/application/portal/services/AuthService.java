package com.application.portal.services;

import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;
import org.springframework.stereotype.Service;

import com.application.portal.models.User;
import com.application.portal.repositories.UserRepository;

@Service
public class AuthService {

    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean login(String email, String password) {
        
        if (email == null || password == null || email.isEmpty() || password.isEmpty()) {
            return false;
        }

        String normalised_email = email.trim().toLowerCase();

        if (normalised_email.isEmpty()) {
            return false;
        }
        
        User user = userRepository.findByEmail(normalised_email);

        if (user == null) {
            return false;
        }

        return Argon2PasswordEncoder.defaultsForSpringSecurity_v5_8().matches(password, user.getPasswordHash());
    }
}
