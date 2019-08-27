package com.example.algorithm.jdbc.dao.impl;


import com.example.algorithm.jdbc.dao.StudentDao;
import com.example.algorithm.jdbc.entity.Student;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * dao
 *
 * @author Jony-Liu
 */
public class StudentDaoImpl extends BaseDao implements StudentDao {

    /**
     * 获取学生的方法
     *
     * @param stuNo
     * @return
     */
    @Override
    public Student getStudent(int stuNo) {
        Student student = null;
        //加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            //建立连接
            con = super.getConnection();
            //执行sql语句
            st = con.createStatement();
            //得到结果集
            String sql = "select * from student where studentno=" + stuNo;
            //executeQuery执行查询语句，executeUpdate执行增删改
            rs = st.executeQuery(sql);
            //rs.next()获取某一行数据
            if (rs.next()) {
                //获取每个字段的值
                int studentno = rs.getInt("studentno");
                String loginpwd = rs.getString("loginpwd");
                String studentname = rs.getString("studentname");
                //获取年月日时分秒
                Date bornDate = rs.getTimestamp("bornDate");
                student = new Student();
                student.setStudentno(studentno);
                student.setStudentname(studentname);
                student.setLoginpwd(loginpwd);
                student.setBornDate(bornDate);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (st != null) {
                    st.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return student;
    }

    public boolean addStudent(int studentno, String loginpwd, String studentname, String sex, int gradeid, String phone, String address, Date bornDate, String email, String identityCard) {
        Connection con = null;
        Statement st = null;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            con = super.getConnection();
            //获取statement,以及执行sql语句
            st = con.createStatement();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            //String sql = "INSERT INTO student VALUES("+studentno+",'"+loginpwd+"','"+studentname+"','"+sex+"',"+gradeid+",'"+phone+"','"+address+"','"+sdf.format(bornDate)+"','"+email+"',"+identityCard+")";
            StringBuffer sb = new StringBuffer("INSERT INTO student VALUES(");
            sb.append(studentno);
            sb.append(",'");
            sb.append(loginpwd).append("','").append(studentname).append("','").append(sex).append("',").append(gradeid).append(",'").append(phone).append("','").append(address).append("','").append(sdf.format(bornDate)).append("','").append(email).append("',").append(identityCard).append(")");
            //返回值是几行收到影响
            int num = st.executeUpdate(sb.toString());
            System.out.println(num);
            if (num > 0) {
                System.out.println("增加成功");
                return true;
            } else {
                System.out.println("增加失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭
            try {
                if (st != null) {
                    st.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 获取所有的学生
     *
     * @return
     */
    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<Student>();
        //加载驱动
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = super.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("select * from student");
            while (rs.next()) {
                int studentNo = rs.getInt("studentno");
                String loginPwd = rs.getString("loginpwd");
                String studentName = rs.getString("studentname");
                //获取年月日时分秒
                Date bornDate = rs.getTimestamp("bornDate");
                Student s = new Student();
                s.setStudentno(studentNo);
                s.setLoginpwd(loginPwd);
                s.setStudentname(studentName);
                s.setBornDate(bornDate);
                list.add(s);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (st != null) {
                    st.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public boolean login(String studentname, String loginpwd) {
        boolean flag = false;
        //加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            //建立连接
            con = super.getConnection();
            //执行sql语句
            st = con.createStatement();
            //得到结果集
            StringBuffer sql = new StringBuffer("select * from student where studentname='");
            sql.append(studentname).append("' and loginpwd='").append(loginpwd).append("'");
            System.out.println(sql);
            //executeQuery执行查询语句，executeUpdate执行增删改
            rs = st.executeQuery(sql.toString());
            if (rs.next()) {
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (st != null) {
                    st.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return flag;
    }

    /**
     * prepareStatement  既安全，效率又高
     *
     * @param studentName
     * @param loginPwd
     * @return
     */
    public boolean loginPre(String studentName, String loginPwd) {
        boolean flag = false;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = super.getConnection();
            //? 占位符
            String sql = "select * from student where studentname=? and loginpwd = ?";
            //预编译
            ps = con.prepareStatement(sql);
            //第一个参数是第几个问号，从1开始；第二个参数是代替问号的数据
            ps.setString(1, studentName);
            ps.setString(2, loginPwd);
            //不要写sql语句
            rs = ps.executeQuery();
            if (rs.next()) {
                flag = true;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        //get student by id
        StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
        Student stu = studentDaoImpl.getStudent(1);
        System.out.println(stu.getStudentname());
        //add data
        studentDaoImpl.addStudent(20016, "123", "周杰伦", "男", 2, "18012345678", "台湾", new Date(), "Jay@163.com", null);
        //get all students
        List<Student> list = studentDaoImpl.getAllStudents();
        for (Student s : list) {
            System.out.println(s);
        }
        boolean flag = studentDaoImpl.loginPre("周杰伦", "123");
        System.out.println(flag);
    }
}

