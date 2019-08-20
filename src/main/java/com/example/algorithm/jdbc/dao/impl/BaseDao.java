package com.example.algorithm.jdbc.dao.impl;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class BaseDao {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    static String driver = null;
    static String url = null;
    static String user = null;
    static String password = null;

    static {
        init();
    }

    public static void init() {
        Properties properties = new Properties();
        String file = "database.properties";
        //从类的根目录中读取文件
        InputStream is = BaseDao.class.getClassLoader().getResourceAsStream(file);
        try {
            properties.load(is);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver = properties.getProperty("driver");
        url = properties.getProperty("url");
        user = properties.getProperty("user");
        password = properties.getProperty("password");
    }

    public Connection getConnection() {
        Connection con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return con;
    }

    /**
     * 执行增删改
     * insert into student values(?,?,?,?)
     * Object[] data={30000,"李四",23,"99@qq.com"};
     *
     * @param sql
     * @param data
     * @return
     */
    public int executeUpdate(String sql, Object[] data) {
        int num = -1;
        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < data.length; i++) {
                ps.setObject(i + 1, data[i]);
            }
            num = ps.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            close();
        }
        return num;
    }

    //查询
    public ResultSet executeQuery(String sql, Object[] data) {
        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < data.length; i++) {
                ps.setObject(i + 1, data[i]);
            }
            rs = ps.executeQuery();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs;
    }

    public void close() {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }


}
