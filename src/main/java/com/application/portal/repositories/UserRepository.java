package com.application.portal.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.portal.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByUserId(long userId);

    List<User> findUsersByRole(String role);
}
