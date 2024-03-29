package com.enesakdn.n11finaluserService.dao;

import com.enesakdn.n11finaluserService.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    @Query("SELECT c FROM Comment c WHERE c.userId = :userId")
    List<Comment> findCommentByUserId(long userId);

    @Query("SELECT c FROM Comment c WHERE c.restaurantId = :restaurantId")
    List<Comment> findCommentByRestaurantId(String restaurantId);

}
