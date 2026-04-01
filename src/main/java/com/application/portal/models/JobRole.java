package com.application.portal.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"JobRole\"")
public class JobRole {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "\"jobRoleId\"")
    private Long id;

    @Column(name = "\"roleName\"")
    private String roleName;

    @Column(name = "\"location\"")
    private String location;

    @Column(name = "\"closingDate\"")
    private LocalDate closingDate;

    @Column(name = "\"description\"")
    private String description;

    @Column(name = "\"responsibilities\"")
    private String responsibilities;

    @Column(name = "\"numberOfOpenPositions\"")
    private int numberOfOpenPositions;

    @Column(name = "\"sharepointUrl\"")
    private String sharepointUrl;

    @Column(name = "\"capabilityId\"")
    private int capabilityId;

    @Column(name = "\"bandId\"")
    private int bandId;
    
    @Column(name = "\"statusId\"")
    private int statusId;

    public JobRole(String roleName, String location, LocalDate closingDate, String description, String responsibilities, int numberOfOpenPositions, String sharepointUrl, int capabilityId, int bandId, int statusId) {
        this.roleName = roleName;
        this.location = location;
        this.closingDate = closingDate;
        this.description = description;
        this.responsibilities = responsibilities;
        this.numberOfOpenPositions = numberOfOpenPositions;
        this.sharepointUrl = sharepointUrl;
        this.capabilityId = capabilityId;
        this.bandId = bandId;
        this.statusId = statusId;
    }

    public JobRole() {
    }

    @Override
    public String toString() {
        return String.format("JobRole[id=%d, roleName='%s', location='%s', closingDate='%s', description='%s', responsibilities='%s', numberOfOpenPositions=%d, sharepointUrl='%s', capabilityId=%d, bandId=%d, statusId=%d]", id, roleName, location, closingDate, description, responsibilities, numberOfOpenPositions, sharepointUrl, capabilityId, bandId, statusId);
    }

    public Long getId() {
        return id;
    }

    public long setId(Long id) {
        this.id = id;
        return id;
    }

    public String getRoleName() {
        return roleName;
    }

    public String setRoleName(String roleName) {
        this.roleName = roleName;
        return roleName;
    }

    public String getLocation() {
        return location;
    }

    public String setLocation(String location) {
        this.location = location;
        return location;
    }

    public LocalDate getClosingDate() {
        return closingDate;
    }

    public LocalDate setClosingDate(LocalDate closingDate) {
        this.closingDate = closingDate;
        return closingDate;
    }

    public String getDescription() {
        return description;
    }

    public String setDescription(String description) {
        this.description = description;
        return description;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public String setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
        return responsibilities;
    }

    public int getNumberOfOpenPositions() {
        return numberOfOpenPositions;
    }

    public int setNumberOfOpenPositions(int numberOfOpenPositions) {
        this.numberOfOpenPositions = numberOfOpenPositions;
        return numberOfOpenPositions;
    }

    public String getSharepointUrl() {
        return sharepointUrl;
    }

    public String setSharepointUrl(String sharepointUrl) {
        this.sharepointUrl = sharepointUrl;
        return sharepointUrl;
    }

    public int getCapabilityId() {
        return capabilityId;
    }

    public int setCapabilityId(int capabilityId) {
        this.capabilityId = capabilityId;
        return capabilityId;
    }

    public int getBandId() {
        return bandId;
    }

    public int setBandId(int bandId) {
        this.bandId = bandId;
        return bandId;
    }

    public int getStatusId() {
        return statusId;
    }

    public int setStatusId(int statusId) {
        this.statusId = statusId;
        return statusId;
    }

}
