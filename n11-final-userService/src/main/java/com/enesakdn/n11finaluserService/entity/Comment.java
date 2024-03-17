package com.enesakdn.n11finaluserService.entity;

import com.enesakdn.n11finaluserService.enums.EnumScore;
import com.enesakdn.n11finaluserService.general.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "COMMENT")
public class Comment extends BaseEntity {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Comment")
    @SequenceGenerator(name = "Comment", sequenceName = "COMMENT_ID_SEQ")
    @Id
    private Long id;

    private long userId;

    private String restaurantId;

    @Column(name = "COMMENT-TOPIC", length = 50)
    private String topic;

    @Column(name = "COMMENT-TEXT", length = 300)
    private String text;

    @Enumerated(EnumType.STRING)
    @Column(name = "SCORE")
    private EnumScore score;

    public String getRestaurantId() {
        return restaurantId;
    }

}
