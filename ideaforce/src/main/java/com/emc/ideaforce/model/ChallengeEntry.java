package com.emc.ideaforce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "entries")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ChallengeEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    /**
     * Reference to global challenge id
     */
    private String challengeId;

    private String userId;

    @ElementCollection(targetClass=String.class)
    private List<String> videos;

    @OneToMany(targetEntity=ChallengeImage.class, mappedBy="imageId", fetch= FetchType.LAZY)
    private List<ChallengeImage> images;

    private boolean approved;

    private Date created;

    private Date lastUpdated;

}
