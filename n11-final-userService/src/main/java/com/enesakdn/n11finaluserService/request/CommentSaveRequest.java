package com.enesakdn.n11finaluserService.request;

import com.enesakdn.n11finaluserService.enums.EnumScore;

/*
* private Long id;

    private long CustomerId;

    private long RestaurantId;

    @Column(name = "COMMENT-TOPIC", length = 50)
    private String topic;

    @Column(name = "COMMENT-TEXT", length = 300)
    private String text;

    @Enumerated(EnumType.STRING)
    @Column(name = "SCORE")
    private EnumScore score;
* */
public record CommentSaveRequest( long userId,
                                  long restaurantId,
                                  String topic,
                                  String text,
                                  EnumScore score) {
}
