package com.line.dao;

import com.line.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    @Test
    void addAndSelect() {
//        UserDao userDao = new UserDao();
        UserDao userDao = new UserDaoFactory().awsUserDao();
        String id = "2";
        userDao.add(new User(id, "BBB", "1111"));

        User user = userDao.findById(id);
        Assertions.assertEquals("BBB", user.getName());
    }
}