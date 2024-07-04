package com.iith.Reditt.clone.repository;


import com.iith.Reditt.clone.model.Post;
import com.iith.Reditt.clone.model.Subreddit;
import com.iith.Reditt.clone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
