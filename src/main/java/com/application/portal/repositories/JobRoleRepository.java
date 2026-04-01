package com.application.portal.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.application.portal.models.JobRole;


public interface JobRoleRepository extends JpaRepository<JobRole, Long> {

    @Query("SELECT j FROM JobRole j WHERE j.location = :location")
    List<JobRole> findByLocation(@Param("location") String location);
    
}
