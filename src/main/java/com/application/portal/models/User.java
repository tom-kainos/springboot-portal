package com.application.portal.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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

}
