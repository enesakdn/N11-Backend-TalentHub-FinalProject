package com.enesakdn.n11finaluserService.faker;

import com.enesakdn.n11finaluserService.entity.Comment;

import java.util.ArrayList;
import java.util.List;

public class CommentFaker {

    public Comment comment() {
        Comment comment = new Comment();
        comment.setId(1L);
        comment.setUserId(1L);
        comment.setRestaurantId("restaurant1");
        comment.setTopic("topic1");
        comment.setText("text1");
        return comment;
    }

    public List<Comment> comments() {
        Comment comment1 = new Comment();
        comment1.setUserId(1L);
        comment1.setRestaurantId("restaurant1");
        comment1.setTopic("topic1");
        comment1.setText("text1");


        Comment comment2 = new Comment();
        comment2.setUserId(2L);
        comment2.setRestaurantId("restaurant2");
        comment2.setTopic("topic2");
        comment2.setText("text2");


        Comment comment3 = new Comment();
        comment3.setUserId(3L);
        comment3.setRestaurantId("restaurant3");
        comment3.setTopic("topic3");
        comment3.setText("text3");


        List<Comment> comments = new ArrayList<>();
        comments.add(comment1);
        comments.add(comment2);
        comments.add(comment3);
        return comments;
    }
}
