package com.iith.Reditt.clone.repository;


import com.iith.Reditt.clone.model.Post;
import com.iith.Reditt.clone.model.User;
import com.iith.Reditt.clone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
