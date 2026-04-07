package com.application.portal.controllers;

import java.time.Instant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.portal.dtos.HealthResponse;
import com.application.portal.repositories.UserRepository;

@RestController
public class HealthController {

    private final UserRepository userRepository;

    public HealthController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/api/health")
    public HealthResponse healthCheck() {
        try {
            long userCount = userRepository.count(); // DB connectivity probe
            return new HealthResponse(
                "healthy",
                "Application is healthy",
                Instant.now().toString(),
                userCount
            );
        } catch (Exception ex) {
            return new HealthResponse(
                "unhealthy",
                "Database check failed: " + ex.getClass().getSimpleName(),
                Instant.now().toString(),
                -1
            );
        }
    }
}
