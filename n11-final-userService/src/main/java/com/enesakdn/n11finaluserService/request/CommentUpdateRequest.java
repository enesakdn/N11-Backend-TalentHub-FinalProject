package com.enesakdn.n11finaluserService.request;

import com.enesakdn.n11finaluserService.enums.EnumScore;

public class CommentUpdateRequest {
    private long id;
    private String topic;
    private String text;
    private EnumScore score;

    public CommentUpdateRequest() {
    }

    public CommentUpdateRequest(long id, String topic, String text, EnumScore score) {
        this.id = id;
        this.topic = topic;
        this.text = text;
        this.score = score;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
        return "CommentUpdateRequest{" +
                "id=" + id +
                ", topic='" + topic + '\'' +
                ", text='" + text + '\'' +
                ", score=" + score +
                '}';
    }
}
