package com.enesakdn.n11finaluserService.controller.contract;

import com.enesakdn.n11finaluserService.dto.CommentDTO;
import com.enesakdn.n11finaluserService.request.CommentSaveRequest;
import com.enesakdn.n11finaluserService.request.CommentUpdateRequest;

import java.util.List;

public interface CommentControllerContract {
    CommentDTO saveComment(CommentSaveRequest request);

    List<CommentDTO> getAllComments();

    CommentDTO updateComment(CommentUpdateRequest request);

    CommentDTO getCommentById(Long id);

    void deleteComment(Long id);

    List<CommentDTO> getCommentByUserId(long userId);
    List<CommentDTO> getCommentsByRestaurantId(String restaurantId);
    double calculateAverageScoreByRestaurantId(String restaurantId);
}
