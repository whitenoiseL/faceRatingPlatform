package com.tsinghua.ratingplatform.Entity;

import javax.persistence.*;

@Entity
@Table(name="t_score_table")
public class Score {
    @Id
    @Column(name = "uid")
    private Integer userId;
    @Column(name = "pid")
    private Integer photoId;
    @Column(name = "score")
    private Integer score;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Integer photoId) {
        this.photoId = photoId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

}

