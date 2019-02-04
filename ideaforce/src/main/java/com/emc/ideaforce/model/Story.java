package com.emc.ideaforce.model;

import lombok.Data;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.EAGER;
import static javax.persistence.FetchType.LAZY;
import static lombok.AccessLevel.NONE;

@Data
@Entity
@Table(name = "stories")
public class Story {

    @Id
    @Column(length = 100)
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    @OneToOne(targetEntity = ChallengeDetail.class, fetch = EAGER)
    @JoinColumn(nullable = false, referencedColumnName="id", name = "challengeId")
    private ChallengeDetail challengeDetail;

    @OneToOne(targetEntity = User.class, fetch = EAGER)
    @JoinColumn(nullable = false, name = "email")
    private User user;

    private String title;

    private String description;

    private String video;

    @Setter(NONE)
    @OneToMany(cascade = ALL, orphanRemoval = true, fetch = LAZY)
    @JoinColumn(name = "pics")
    private List<StoryImage> images = new ArrayList<>();

    private boolean approved;

    private Date created;

    private Date lastUpdated;

    public Story() {
        this.created = new Date();
        this.lastUpdated = new Date();
    }

    public void addImage(StoryImage image) {
        this.images.add(image);
    }

}
