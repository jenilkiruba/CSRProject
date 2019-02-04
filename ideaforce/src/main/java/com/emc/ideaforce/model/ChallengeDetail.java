package com.emc.ideaforce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
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
    @Lob
    private String description;

    @NotBlank
    @Lob
    private String environmentalIssues;

    @NotBlank
    @Lob
    private String participationSteps;

    @NotBlank
    @Lob
    private String reference;

}
