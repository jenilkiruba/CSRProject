package com.csrproject.repository;

import com.csrproject.model.Challenges;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by kaushv5 on 12/1/2018.
 */
public interface ChallengeRepository extends JpaRepository<Challenges, Long> {

}
