package com.emc.ideaforce.repository;

import com.emc.ideaforce.model.ChallengeEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChallengeEntryRepository extends JpaRepository<ChallengeEntry, String> {
}
