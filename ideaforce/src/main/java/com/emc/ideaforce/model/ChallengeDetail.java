package com.emc.ideaforce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Table(name = "challenges")
@AllArgsConstructor
@NoArgsConstructor
public class ChallengeDetail {

    @Id
    @Column(length = 100)
    private String id;

    @NotBlank
    private String name;

    @NotBlank
    @Column(length = 1000)
    private String description;

    @NotBlank
    @Column(length = 1000)
    private String environmentalIssues;

    @NotBlank
    @Column(length = 1000)
    private String participationSteps;

    @NotBlank
    @Column(length = 100)
    private String reference;

}
