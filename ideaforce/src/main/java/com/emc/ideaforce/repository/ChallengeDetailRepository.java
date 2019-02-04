package com.emc.ideaforce.repository;

import com.emc.ideaforce.model.ChallengeDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChallengeDetailRepository extends JpaRepository<ChallengeDetail, String> {
}
