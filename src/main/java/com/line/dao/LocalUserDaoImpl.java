//package com.line.dao;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.Map;
//
//public class LocalUserDaoImpl extends UserDaoAbstract{
//    @Override
//    public Connection makeConnection() throws SQLException {
//        Map<String, String> env;
//        env = System.getenv();
//        Connection c = DriverManager.getConnection(env.get("jdbc:mysql://ec2-3-34-28-100.ap-northeast-2.compute.amazonaws.com/likelion-db2"),
//                env.get("root"), env.get("password"));
//        return c;
//    }
//}
