package com.application.portal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.application.portal.services.AuthService;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AuthServiceIntegrationTest {

    @Autowired
    private AuthService authService;

    @Test
    void login_withRealUser_returnsTrue() {
        assertTrue(authService.login("admin@kainos.com", "Admin123!"));
    }

    @Test
    void login_withWrongPassword_returnsFalse() {
        assertFalse(authService.login("admin@kainos.com", "wrongPassword"));
    }

    @Test
    void login_withUnknownEmail_returnsFalse() {
        assertFalse(authService.login("nobody@kainos.com", "password"));
    }
}