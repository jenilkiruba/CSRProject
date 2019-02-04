package com.emc.ideaforce.repository;

import com.emc.ideaforce.model.Story;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoryRepository extends JpaRepository<Story, String> {

    String FIND_BY_USER = "SELECT s FROM Story s JOIN s.user u WHERE u.email = :email";

    List<Story> findByApprovedIsFalse();

    @Query(FIND_BY_USER)
    List<Story> findByUserEqualsAndApprovedIsTrue(@Param("email") String userId);

    Story findStoryByIdEquals(String entryId);

    @Query(FIND_BY_USER)
    List<Story> findByUserEquals(@Param("email") String userId);

    List<Story> findTop20ByApprovedIsTrueOrderByLastUpdatedDesc();

    @Query("SELECT u.email as userId, COUNT(u) as count "
            + "FROM Story s JOIN s.user u "
            + "WHERE s.approved=true "
            + "GROUP BY u.email "
            + "ORDER BY COUNT(u.email) DESC")
    List<ChallengerCountProjection> findUsersWithStoryCount();

}
