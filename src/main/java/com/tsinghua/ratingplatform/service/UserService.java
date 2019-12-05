package com.tsinghua.ratingplatform.service;

import java.util.List;
import com.tsinghua.ratingplatform.Entity.*;

public interface UserService {

    void addUser(User user);

    void removeUser(Integer id);

    void modifyUser(User user);

    List<User> findAll();

    User findUser(Integer id);
}
