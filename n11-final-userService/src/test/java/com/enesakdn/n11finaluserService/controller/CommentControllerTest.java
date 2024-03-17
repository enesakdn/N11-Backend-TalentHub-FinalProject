package com.enesakdn.n11finaluserService.controller;

import com.enesakdn.n11finaluserService.controller.CommentController;
import com.enesakdn.n11finaluserService.controller.contract.CommentControllerContract;
import com.enesakdn.n11finaluserService.dto.CommentDTO;
import com.enesakdn.n11finaluserService.request.CommentSaveRequest;
import com.enesakdn.n11finaluserService.request.CommentUpdateRequest;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class CommentControllerTest {

    @Mock
    private CommentControllerContract commentControllerContract;

    @InjectMocks
    private CommentController commentController;

    @Test
    void getAllCommentsTest() {
        List<CommentDTO> commentDTOList = new ArrayList<>();
        when(commentControllerContract.getAllComments()).thenReturn(commentDTOList);
        ResponseEntity<?> responseEntity = commentController.getAllComments();
        assertEquals(commentDTOList, responseEntity.getBody());
    }

    @Test
    void getCommentByIdTest() {
        Long id = 1L;
        CommentDTO commentDTO = new CommentDTO();
        when(commentControllerContract.getCommentById(id)).thenReturn(commentDTO);
        ResponseEntity<?> responseEntity = commentController.getCommentById(id);
        assertEquals(commentDTO, responseEntity.getBody());
    }

    @Test
    void saveCommentTest() {
        CommentSaveRequest request = new CommentSaveRequest();
        CommentDTO commentDTO = new CommentDTO();
        when(commentControllerContract.saveComment(request)).thenReturn(commentDTO);
        ResponseEntity<?> responseEntity = commentController.saveComment(request);
        assertEquals(commentDTO, responseEntity.getBody());
    }

    @Test
    void deleteCommentTest() {
        Long id = 1L;
        ResponseEntity<?> responseEntity = commentController.deleteComment(id);
        assertEquals(ResponseEntity.ok().build(), responseEntity);
        verify(commentControllerContract, times(1)).deleteComment(id);
    }

    @Test
    void updateCommentTest() {
        Long id = 1L;
        CommentUpdateRequest request = new CommentUpdateRequest();
        CommentDTO commentDTO = new CommentDTO();
        when(commentControllerContract.updateComment(request)).thenReturn(commentDTO);
        ResponseEntity<?> responseEntity = commentController.updateComment(id, request);
        assertEquals(commentDTO, responseEntity.getBody());
    }

    @Test
    void getCommentByUserIdTest() {
        Long userId = 1L;
        List<CommentDTO> commentDTOList = new ArrayList<>();
        when(commentControllerContract.getCommentByUserId(userId)).thenReturn(commentDTOList);
        ResponseEntity<?> responseEntity = commentController.getCommentByUserId(userId);
        assertEquals(commentDTOList, responseEntity.getBody());
    }

    @Test
    void getCommentsByRestaurantIdTest() {
        String restaurantId = "1";
        List<CommentDTO> commentDTOList = new ArrayList<>();
        when(commentControllerContract.getCommentsByRestaurantId(restaurantId)).thenReturn(commentDTOList);
        ResponseEntity<?> responseEntity = commentController.getCommentsByRestaurantId(restaurantId);
        assertEquals(commentDTOList, responseEntity.getBody());
    }

    @Test
    void getAverageScoreByRestaurantIdTest() {
        String restaurantId = "1";
        double averageScore = 4.5;
        when(commentControllerContract.calculateAverageScoreByRestaurantId(restaurantId)).thenReturn(averageScore);
        ResponseEntity<?> responseEntity = commentController.getAverageScoreByRestaurantId(restaurantId);
        assertEquals(averageScore, responseEntity.getBody());
    }
}
