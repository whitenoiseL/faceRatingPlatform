package com.tsinghua.ratingplatform.service.impl;

import com.tsinghua.ratingplatform.Dao.ScoreRepository;
import com.tsinghua.ratingplatform.service.ScoreService;
import com.tsinghua.ratingplatform.Entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private ScoreRepository scoreRepository;

    @Override
    public void addRate(Score score) {
        scoreRepository.save(score);
    }

    @Override
    public void removeRate(Integer uid) {
        scoreRepository.deleteById(uid);
    }

    @Override
    public void modifyRate(Score score) {
        scoreRepository.saveAndFlush(score);
    }

    @Override
    public List<Score> findAll() {
        return scoreRepository.findAll();
    }

    @Override
    public Score findRate(Integer uid) {
        return scoreRepository.findByUserId(uid);
    }

}
