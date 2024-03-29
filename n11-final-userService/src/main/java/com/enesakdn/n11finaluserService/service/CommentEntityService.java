package com.enesakdn.n11finaluserService.service;
import com.enesakdn.n11finaluserService.dao.CommentRepository;
import com.enesakdn.n11finaluserService.dao.UserRepository;
import com.enesakdn.n11finaluserService.dto.CommentDTO;
import com.enesakdn.n11finaluserService.entity.Comment;
import com.enesakdn.n11finaluserService.entity.User;
import com.enesakdn.n11finaluserService.errormessage.CommentErrorMessage;
import com.enesakdn.n11finaluserService.general.ApplicationBusinessException;
import com.enesakdn.n11finaluserService.general.BaseEntityService;
import com.enesakdn.n11finaluserService.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentEntityService extends BaseEntityService<Comment, CommentRepository> {
    private final UserRepository userRepository;
    protected CommentEntityService(CommentRepository repository,UserRepository userRepository) {
        super(repository);
        this.userRepository = userRepository;

    }
    public List<Comment> findCommentByUserId(long userId) {
        User user = userRepository.findById(userId).orElse(null);
        if (user == null) {
            throw new ApplicationBusinessException(CommentErrorMessage.USER_NOT_FOUND);
        }
        return getRepository().findCommentByUserId(userId);
    }

    public List<Comment> findCommentsByRestaurantId(String restaurantId) {
        List<Comment> comments = getRepository().findCommentByRestaurantId(restaurantId);
        return comments;
    }
    public double calculateAverageScoreByRestaurantId(String restaurantId) {
        List<Comment> comments = getRepository().findCommentByRestaurantId(restaurantId);
        double totalScore = 0;
        int commentCount = comments.size();

        for (Comment comment : comments) {
            totalScore += comment.getScore().getValue();
        }

        return commentCount > 0 ? totalScore / commentCount : 0;
    }
}
