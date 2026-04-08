package com.application.portal.models;

import java.time.LocalDate;

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

}
