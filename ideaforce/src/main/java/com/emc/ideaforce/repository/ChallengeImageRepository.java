package com.emc.ideaforce.repository;

import com.emc.ideaforce.model.ChallengeImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChallengeImageRepository extends JpaRepository<ChallengeImage, String> {
}
