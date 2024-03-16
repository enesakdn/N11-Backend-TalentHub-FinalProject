package com.enesakdn.n11finaluserService.service;
import com.enesakdn.n11finaluserService.dao.CommentRepository;
import com.enesakdn.n11finaluserService.entity.Comment;
import com.enesakdn.n11finaluserService.general.BaseEntityService;
import org.springframework.stereotype.Service;

@Service
public class CommentEntityService extends BaseEntityService<Comment, CommentRepository> {

    protected CommentEntityService(CommentRepository repository) {
        super(repository);
    }
}
