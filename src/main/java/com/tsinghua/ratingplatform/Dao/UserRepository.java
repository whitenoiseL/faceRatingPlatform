package com.tsinghua.ratingplatform.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsinghua.ratingplatform.Entity.*;

public interface UserRepository extends JpaRepository<User,Integer>{
}
