package com.enesakdn.n11finaluserService.dao;

import com.enesakdn.n11finaluserService.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
