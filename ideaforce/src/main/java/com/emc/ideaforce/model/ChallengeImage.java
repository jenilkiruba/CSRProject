package com.emc.ideaforce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "images")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChallengeImage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String imageId;

    @ManyToOne
    @JoinColumn(name="id")
    private ChallengeEntry challengeEntry;

    private byte[] data;
}
