package com.application.portal.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.portal.models.JobRole;


public interface JobRoleRepository extends JpaRepository<JobRole, Long> {

    List<JobRole> findByLocation(String location);
    
}
