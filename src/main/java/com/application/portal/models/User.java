package com.application.portal.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"User\"")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "\"userId\"")
    private Long userId;

    @Column(name = "\"email\"")
    private String email;

    @Column(name = "\"passwordHash\"")
    private String passwordHash;

    @Column(name = "\"role\"")
    private String role;

    protected User() {}

    public User(String email, String passwordHash, String role) {
        this.email = email;
        this.passwordHash = passwordHash;
        this.role = role;
    }

    @Override
    public String toString() {
        return String.format("User[userId=%d, email='%s', passwordHash='%s', role='%s']", userId, email, passwordHash, role);
    }

    public Long getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public String getRole() {
        return role;
    }

}
