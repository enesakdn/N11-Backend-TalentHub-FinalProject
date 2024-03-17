package com.enesakdn.n11finaluserService.request;

import com.enesakdn.n11finaluserService.enums.EnumScore;

public class CommentSaveRequest {
    private long userId;
    private String restaurantId;
    private String topic;
    private String text;
    private EnumScore score;

    public CommentSaveRequest() {
    }

    public CommentSaveRequest(long userId, String restaurantId, String topic, String text, EnumScore score) {
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.topic = topic;
        this.text = text;
        this.score = score;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public EnumScore getScore() {
        return score;
    }

    public void setScore(EnumScore score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "CommentSaveRequest{" +
                "userId=" + userId +
                ", restaurantId='" + restaurantId + '\'' +
                ", topic='" + topic + '\'' +
                ", text='" + text + '\'' +
                ", score=" + score +
                '}';
    }
}
