package com.enesakdn.n11finaluserService.mapper;



import com.enesakdn.n11finaluserService.dto.CommentDTO;
import com.enesakdn.n11finaluserService.entity.Comment;
import com.enesakdn.n11finaluserService.request.CommentSaveRequest;
import com.enesakdn.n11finaluserService.request.CommentUpdateRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CommentMapper {

    CommentMapper INSTANCE = Mappers.getMapper(CommentMapper.class);

    Comment convertToComment(CommentSaveRequest request);

    CommentDTO convertToCommentDTO(Comment comment);

    List<CommentDTO> convertToCommentDTOs(List<Comment> comment);

    @Mapping(target = "id", ignore = true)
    void updateCommentFields(@MappingTarget Comment comment, CommentUpdateRequest request);
}
