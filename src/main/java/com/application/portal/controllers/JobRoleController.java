package com.application.portal.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.portal.models.JobRole;
import com.application.portal.repositories.JobRoleRepository;

@RestController
public class JobRoleController {

    private final JobRoleRepository jobRoleRepository;

    JobRoleController(JobRoleRepository jobRoleRepository) {
        this.jobRoleRepository = jobRoleRepository;
    }

    @GetMapping("/api/job-roles")
    public Iterable<JobRole> getAllJobRoles() {
        return jobRoleRepository.findAll();
    }
    
}
