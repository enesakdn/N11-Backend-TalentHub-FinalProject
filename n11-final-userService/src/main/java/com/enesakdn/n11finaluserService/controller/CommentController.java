package com.enesakdn.n11finaluserService.controller;

import com.enesakdn.n11finaluserService.controller.contrat.CommentControllerContract;
import com.enesakdn.n11finaluserService.dto.CommentDTO;
import com.enesakdn.n11finaluserService.general.RestResponse;
import com.enesakdn.n11finaluserService.request.CommentSaveRequest;
import com.enesakdn.n11finaluserService.request.CommentUpdateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {

    private final CommentControllerContract commentControllerContract;

    @GetMapping
    public ResponseEntity<RestResponse<List<CommentDTO>>> getAllComments() {
        List<CommentDTO> allComments = commentControllerContract.getAllComments();
        return ResponseEntity.ok(RestResponse.of(allComments));
    }

    @GetMapping("/{id}")
    public ResponseEntity<RestResponse<CommentDTO>> getCommentById(@PathVariable Long id) {
        CommentDTO commentById = commentControllerContract.getCommentById(id);
        return ResponseEntity.ok(RestResponse.of(commentById));
    }

    @PostMapping
    public ResponseEntity<RestResponse<CommentDTO>> saveComment(@RequestBody CommentSaveRequest request) {
        CommentDTO commentDTO = commentControllerContract.saveComment(request);
        return ResponseEntity.ok(RestResponse.of(commentDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<RestResponse<Void>> deleteComment(@PathVariable Long id) {
        commentControllerContract.deleteComment(id);
        return ResponseEntity.ok(RestResponse.empty());
    }

    @PutMapping("/{id}")
    public ResponseEntity<RestResponse<CommentDTO>> updateComment(@PathVariable Long id, @RequestBody CommentUpdateRequest request) {
        CommentDTO commentDTO = commentControllerContract.updateComment(request);
        return ResponseEntity.ok(RestResponse.of(commentDTO));
    }
}