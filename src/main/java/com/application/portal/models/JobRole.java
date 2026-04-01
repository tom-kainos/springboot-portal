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

    protected JobRole() {}

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

    @Override
    public String toString() {
        return String.format("JobRole[id=%d, roleName='%s', location='%s', closingDate='%s', description='%s', responsibilities='%s', numberOfOpenPositions=%d, sharepointUrl='%s', capabilityId=%d, bandId=%d, statusId=%d]", id, roleName, location, closingDate, description, responsibilities, numberOfOpenPositions, sharepointUrl, capabilityId, bandId, statusId);
    }

    public Long getId() {
        return id;
    }

    public String getRoleName() {
        return roleName;
    }

    public String getLocation() {
        return location;
    }

    public LocalDate getClosingDate() {
        return closingDate;
    }

    public String getDescription() {
        return description;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public int getNumberOfOpenPositions() {
        return numberOfOpenPositions;
    }

    public String getSharepointUrl() {
        return sharepointUrl;
    }

    public int getCapabilityId() {
        return capabilityId;
    }

    public int getBandId() {
        return bandId;
    }

    public int getStatusId() {
        return statusId;
    }

}
