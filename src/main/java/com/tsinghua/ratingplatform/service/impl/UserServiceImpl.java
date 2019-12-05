package com.tsinghua.ratingplatform.service.impl;

import com.tsinghua.ratingplatform.Dao.UserRepository;
import com.tsinghua.ratingplatform.service.UserService;
import com.tsinghua.ratingplatform.Entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void removeUser(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public void modifyUser(User user) {
        userRepository.saveAndFlush(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findUser(Integer id) {
        return userRepository.findById(id).orElse(null);
    }


}
