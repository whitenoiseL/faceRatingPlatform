package com.tsinghua.ratingplatform.service;

import java.util.List;
import com.tsinghua.ratingplatform.Entity.*;

public interface ScoreService {

    void addRate(Score score);

    void removeRate(Integer uid);

    void modifyRate(Score score);

    List<Score> findAll();

    Score findRate(Integer uid);
}
