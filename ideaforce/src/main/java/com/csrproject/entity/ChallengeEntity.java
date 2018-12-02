package com.csrproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "challenge")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChallengeEntity {

    @Id
    private long id;

    @NotBlank
    private String name;

    @NotBlank
    private String description;

}
