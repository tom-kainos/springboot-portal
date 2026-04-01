package com.application.portal.dtos;

public class RoleDTO {
    private String roleName;
    private String location;

    public RoleDTO(String roleName, String location) {
        this.roleName = roleName;
        this.location = location;
    }

    public RoleDTO() {
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
