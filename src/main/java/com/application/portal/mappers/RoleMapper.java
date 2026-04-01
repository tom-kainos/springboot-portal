package com.application.portal.mappers;

import org.springframework.stereotype.Component;

import com.application.portal.dtos.RoleDTO;
import com.application.portal.models.JobRole;

@Component
public class RoleMapper {

    public RoleDTO toDTO(JobRole jobRole) {
        RoleDTO dto = new RoleDTO();
        dto.setRoleName(jobRole.getRoleName());
        dto.setLocation(jobRole.getLocation());
        return dto;
    }

    public JobRole toEntity(RoleDTO roleDTO) {
        JobRole jobRole = new JobRole();
        jobRole.setRoleName(roleDTO.getRoleName());
        jobRole.setLocation(roleDTO.getLocation());
        return jobRole;
    }
}
