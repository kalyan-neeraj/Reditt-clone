package com.iith.Reditt.clone.repository;


import com.iith.Reditt.clone.model.Comment;
import com.iith.Reditt.clone.model.Post;
import com.iith.Reditt.clone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
