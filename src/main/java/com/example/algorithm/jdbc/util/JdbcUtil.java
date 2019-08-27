package com.example.algorithm.jdbc.util;

import com.example.algorithm.jdbc.entity.Student;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;

/**
 * @author Jony-Liu
 * @date 2019/8/27 21:58
 */
public class JdbcUtil {

    /**
     * 通过查询返回单个对象
     *
     * @param clazz
     * @param sql
     * @param args
     * @return
     */
    public static <T> T getForObject(Class<T> clazz, String sql, Object... args) {
        T entity = null;
        JdbcTools jt = new JdbcTools();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = jt.getConnection();
        try {
            ps = con.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }
            rs = ps.executeQuery();
            String name;
            Object obj;
            if (rs.next()) {
                ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
                Map<String, Object> columnAndValue = new HashMap<>();
                for (int i = 0; i < rsmd.getColumnCount(); i++) {
                    name = rsmd.getColumnLabel(i + 1);
                    obj = rs.getObject(i + 1);
                    columnAndValue.put(name, obj);
                }
                if (columnAndValue.size() > 0) {
                    try {
                        entity = clazz.newInstance();
                        for (String columnname : columnAndValue.keySet()) {
                            BeanUtils.setProperty(entity, columnname, columnAndValue.get(columnname));
                        }
                    } catch (InstantiationException | IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcTools.close(rs, ps, con);
        }

        return entity;
    }

    /**
     * 通过多行查询返回一个List集合
     *
     * @param clazz
     * @param sql
     * @param objects
     * @return
     */
    public static <T> List<T> selectForList(Class<T> clazz, String sql, Object... objects) {
        List<T> list = new ArrayList<>();
        JdbcTools tools = new JdbcTools();
        // 声明连接，命令，结果集
        Connection conn;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        conn = tools.getConnection();
        try {
            pstmt = conn.prepareStatement(sql);
            for (int i = 0; i < objects.length; i++) {
                pstmt.setObject(i + 1, objects[i]);
            }
            rs = pstmt.executeQuery();

            // List<Map<String, Object>> values=new ArrayList<>();
            while (rs.next()) {
                ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
                Map<String, Object> columnValues = new HashMap<>();
                for (int i = 0; i < rsmd.getColumnCount(); i++) {
                    String columnName = rsmd.getColumnLabel(i + 1);
                    Object columnValue = rs.getObject(i + 1);
                    columnValues.put(columnName, columnValue);
                }
                T entity = clazz.newInstance();
                for (Entry<String, Object> object : columnValues.entrySet()) {
                    BeanUtils.setProperty(entity, object.getKey(), object.getValue());
                }
                list.add(entity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } finally {
            JdbcTools.close(rs, pstmt, conn);
        }
        return list;

    }

    /**
     * 增加，删除，修改数据库内容
     *
     * @param sql
     * @param args
     * @return
     */
    public static int modifyData(String sql, Object... args) {
        int flag = 0;
        JdbcTools tools = new JdbcTools();
        Connection con = null;
        PreparedStatement ps = null;

        con = tools.getConnection();
        try {
            ps = con.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }
            flag = ps.executeUpdate();  //数据表受影响的行数
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcTools.close(null, ps, con);
        }

        return flag;
    }

    public static void main(String[] args) {

        String sql = "SELECT studentno,loginpwd,studentname,sex,gradeId FROM student WHERE studentno= ? ";
        Student st = JdbcUtil.getForObject(Student.class, sql, 20013);
        System.out.println("-------------");
        System.out.println(st.toString());

        String sql02 = "SELECT studentno,studentname,sex,address FROM student WHERE sex = ?";
        List<Student> stu = JdbcUtil.selectForList(Student.class, sql02, "男");
        for (Student student : stu) {
            System.out.println(student);
        }

        String birth = "1990-09-08 12:00:00";
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Timestamp birthsql = null;
        try {
            java.util.Date date = s.parse(birth);
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            birthsql = new Timestamp(c.getTimeInMillis());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String sql01 = "INSERT INTO student VALUES(?,?,?,?,?,?,?,?,?,?)";
        Object[] objs = {20013, "123", "周杰伦", "男", 1, "13878789595", "中国台湾", birthsql, "Jay@163.com",
                "12345"};
        int flag = JdbcUtil.modifyData(sql01, objs);
        System.out.println(flag);

    }
}
