package com.enesakdn.n11finaluserService.controller.contract;

import com.enesakdn.n11finaluserService.controller.contract.CommentControllerContract;
import com.enesakdn.n11finaluserService.controller.contract.impl.CommentControllerContractImpl;
import com.enesakdn.n11finaluserService.dto.CommentDTO;
import com.enesakdn.n11finaluserService.entity.Comment;
import com.enesakdn.n11finaluserService.request.CommentSaveRequest;
import com.enesakdn.n11finaluserService.request.CommentUpdateRequest;
import com.enesakdn.n11finaluserService.service.CommentEntityService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class CommentControllerContractImplTest {

    @Mock
    private CommentEntityService commentEntityService;

    @InjectMocks
    private CommentControllerContractImpl commentControllerContract;

    @Test
    void saveCommentTest() {
        CommentSaveRequest request = new CommentSaveRequest();
        when(commentEntityService.save(any())).thenReturn(new Comment());
        CommentDTO savedComment = commentControllerContract.saveComment(request);
        assertEquals(new CommentDTO(), savedComment);
    }

    @Test
    void getAllCommentsTest() {
        List<Comment> commentList = new ArrayList<>();
        when(commentEntityService.findAll()).thenReturn(commentList);
        List<CommentDTO> allComments = commentControllerContract.getAllComments();
        assertEquals(commentList.size(), allComments.size());
    }

    @Test
    void updateCommentTest() {
        CommentUpdateRequest request = new CommentUpdateRequest();
        when(commentEntityService.findByIdWithControl(anyLong())).thenReturn(new Comment());
        when(commentEntityService.save(any())).thenReturn(new Comment());
        CommentDTO updatedComment = commentControllerContract.updateComment(request);
        assertEquals(new CommentDTO(), updatedComment);
    }

    @Test
    void getCommentByIdTest() {
        Long id = 1L;
        when(commentEntityService.findByIdWithControl(anyLong())).thenReturn(new Comment());
        CommentDTO commentById = commentControllerContract.getCommentById(id);
        assertEquals(new CommentDTO(), commentById);
    }

    @Test
    void deleteCommentTest() {
        Long id = 1L;
        doNothing().when(commentEntityService).delete(anyLong());
        commentControllerContract.deleteComment(id);
        verify(commentEntityService, times(1)).delete(id);
    }

    @Test
    void getCommentByUserIdTest() {
        long userId = 1L;
        when(commentEntityService.findCommentByUserId(anyLong())).thenReturn(new ArrayList<>());
        List<CommentDTO> commentsByUserId = commentControllerContract.getCommentByUserId(userId);
        assertEquals(0, commentsByUserId.size());
    }

    @Test
    void getCommentsByRestaurantIdTest() {
        String restaurantId = "1";
        when(commentEntityService.findCommentsByRestaurantId(anyString())).thenReturn(new ArrayList<>());
        List<CommentDTO> commentsByRestaurantId = commentControllerContract.getCommentsByRestaurantId(restaurantId);
        assertEquals(0, commentsByRestaurantId.size());
    }

    @Test
    void calculateAverageScoreByRestaurantIdTest() {
        String restaurantId = "1";
        double expectedAverageScore = 4.5;
        when(commentEntityService.calculateAverageScoreByRestaurantId(anyString())).thenReturn(expectedAverageScore);
        double calculatedAverageScore = commentControllerContract.calculateAverageScoreByRestaurantId(restaurantId);
        assertEquals(expectedAverageScore, calculatedAverageScore);
    }
}
