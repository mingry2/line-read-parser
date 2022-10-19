package com.line.dao;

public class UserDaoFactory {
    // 조립 해주는 것
    public UserDao awsUserDao() { // 날개 5개 선풍기
        AWSConnectionMaker awsConnectionMaker = new AWSConnectionMaker();
        UserDao userDao = new UserDao(awsConnectionMaker);
        return userDao;
    }

    public UserDao localUserDao() { // 날개 4개 선풍기
        UserDao userDao = new UserDao(new LocalConnectionMaker());
        return userDao;
    }
}
