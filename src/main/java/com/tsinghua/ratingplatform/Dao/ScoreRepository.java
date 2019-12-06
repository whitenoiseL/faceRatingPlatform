package com.tsinghua.ratingplatform.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tsinghua.ratingplatform.Entity.*;

import java.util.List;

public interface ScoreRepository extends JpaRepository<Score,Integer>{

    Score findByUserId(Integer uid);
}
