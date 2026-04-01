package com.application.portal.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.application.portal.dtos.RoleDTO;
import com.application.portal.mappers.RoleMapper;
import com.application.portal.models.JobRole;
import com.application.portal.repositories.JobRoleRepository;

@RestController
public class JobRoleController {

    private final JobRoleRepository jobRoleRepository;

    @Autowired
    private RoleMapper jobRoleMapper;

    JobRoleController(JobRoleRepository jobRoleRepository) {
        this.jobRoleRepository = jobRoleRepository;
    }

    @GetMapping("/api/job-roles")
    public Iterable<JobRole> getAllJobRoles() {
        return jobRoleRepository.findAll();
    }
    
    @GetMapping("/api/job-roles/location")
    public ResponseEntity<List<RoleDTO>> getJobRolesByLocation(@RequestParam String location) {
        List<JobRole> jobRoles = jobRoleRepository.findByLocation(location);

        List<RoleDTO> dtoList = new ArrayList<>();
        for (JobRole jobRole : jobRoles) {
            dtoList.add(jobRoleMapper.toDTO(jobRole));
        }
        
        return ResponseEntity.ok(dtoList);
    }

}
