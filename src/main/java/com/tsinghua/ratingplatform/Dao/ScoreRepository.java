package com.tsinghua.ratingplatform.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsinghua.ratingplatform.Entity.*;

public interface ScoreRepository extends JpaRepository<Score,Integer>{
}
