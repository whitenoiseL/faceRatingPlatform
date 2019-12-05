package com.tsinghua.ratingplatform.Entity;

import javax.persistence.*;

@Entity
@Table(name="t_user_table")
public class User {
    @Id
    @Column(name = "id")
    private Integer userId;
    @Column(name = "gender")
    private Integer gender;
    @Column(name = "age")
    private Integer age;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
