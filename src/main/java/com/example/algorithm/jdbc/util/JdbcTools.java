package com.example.algorithm.jdbc.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * 单一职责原则：高内聚，低耦合
 *
 * @author Jony-Liu
 * @date 2019/8/27 22:00
 */
public class JdbcTools {
    public Connection getConnection() {
        Connection con = null;
        Properties p = new Properties();
        String path = "com/example/algorithm/jdbc/database.properties";
        InputStream file = this.getClass().getClassLoader().getResourceAsStream(path);
        try {
            p.load(file);
            String driver = p.getProperty("driver");
            String url = p.getProperty("url");
            String user = p.getProperty("user");
            String password = p.getProperty("password");
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    /**
     * close the connection
     *
     * @param rs
     * @param ps
     * @param con
     */
    public static void close(ResultSet rs, PreparedStatement ps, Connection con) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
