package com.enesakdn.n11finaluserService.controller.contract.impl;

import com.enesakdn.n11finaluserService.controller.contract.CommentControllerContract;
import com.enesakdn.n11finaluserService.dto.CommentDTO;
import com.enesakdn.n11finaluserService.entity.Comment;
import com.enesakdn.n11finaluserService.mapper.CommentMapper;
import com.enesakdn.n11finaluserService.request.CommentSaveRequest;
import com.enesakdn.n11finaluserService.request.CommentUpdateRequest;
import com.enesakdn.n11finaluserService.service.CommentEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CommentControllerContractImpl implements CommentControllerContract {

    private final CommentEntityService commentEntityService;

    @Override
    public CommentDTO saveComment(CommentSaveRequest request) {
        Comment comment = CommentMapper.INSTANCE.convertToComment(request);
        comment = commentEntityService.save(comment);
        return CommentMapper.INSTANCE.convertToCommentDTO(comment);
    }

    @Override
    public List<CommentDTO> getAllComments() {
        List<Comment> commentList = commentEntityService.findAll();
        return CommentMapper.INSTANCE.convertToCommentDTOs(commentList);
    }

    @Override
    public CommentDTO updateComment(CommentUpdateRequest request) {
        Comment comment = commentEntityService.findByIdWithControl(request.id());
        CommentMapper.INSTANCE.updateCommentFields(comment, request);
        commentEntityService.save(comment);
        return CommentMapper.INSTANCE.convertToCommentDTO(comment);
    }

    @Override
    public CommentDTO getCommentById(Long id) {
        Comment comment = commentEntityService.findByIdWithControl(id);
        return CommentMapper.INSTANCE.convertToCommentDTO(comment);
    }

    @Override
    public void deleteComment(Long id) {
        commentEntityService.delete(id);
    }

    @Override
    public List<CommentDTO> getCommentByUserId(long userId) {
        List<Comment> comments = commentEntityService.findCommentByUserId(userId);
        return CommentMapper.INSTANCE.convertToCommentDTOs(comments);
    }
}

