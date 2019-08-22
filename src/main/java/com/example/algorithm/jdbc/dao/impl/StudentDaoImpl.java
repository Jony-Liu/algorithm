package com.example.algorithm.jdbc.dao.impl;


import com.example.algorithm.jdbc.dao.StudentDao;
import com.example.algorithm.jdbc.entity.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * dao
 * @author Jony-Liu
 */
public class StudentDaoImpl implements StudentDao {

    /**
     * 获取学生的方法
     * @param stuNo
     * @return
     */
    @Override
    public Student getStudent(int stuNo){
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
            //?useUnicode=true&characterEncoding=utf8  jdbc和数据库交互数据的编码自己设置，设置成utf8
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/myschool?useUnicode=true&characterEncoding=utf8", "root", "123456");
            //执行sql语句
            st = con.createStatement();
            //得到结果集
            String sql = "select * from student where studentno="+stuNo;
            //executeQuery执行查询语句，executeUpdate执行增删改
            rs = st.executeQuery(sql);
            //rs.next()获取某一行数据
            if(rs.next()){
                //获取每个字段的值
                int studentno = rs.getInt("studentno");
                String loginpwd = rs.getString("loginpwd");
                String studentname = rs.getString("studentname");
                //Date bornDate = rs.getDate("bornDate");//获取年月日
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
        }finally{
            //关闭
            try {
                if(rs!=null){
                    rs.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                if(st!=null){
                    st.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                if(con!=null){
                    con.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return student;
    }

    public boolean addStudent(int studentno,String loginpwd,String studentname,String sex,int gradeid,String phone,String address,Date bornDate,String email,String identityCard){
        Connection con = null;
        Statement st = null;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //建立连接
            String url="jdbc:mysql://127.0.0.1:3306/myschool";
            String user = "root";
            String password = "123456";
            con = DriverManager.getConnection(url, user, password);

            //获取statement,以及执行sql语句
            st = con.createStatement();
			/*String name = "张三";
			System.out.println("你的名字是name");*/
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            //String sql = "INSERT INTO student VALUES("+studentno+",'"+loginpwd+"','"+studentname+"','"+sex+"',"+gradeid+",'"+phone+"','"+address+"','"+sdf.format(bornDate)+"','"+email+"',"+identityCard+")";
            StringBuffer sb = new StringBuffer("INSERT INTO student VALUES(");
            sb.append(studentno);
            sb.append(",'");
            sb.append(loginpwd).append("','").append(studentname).append("','").append(sex).append("',").append(gradeid).append(",'").append(phone).append("','").append(address).append("','").append(sdf.format(bornDate)).append("','").append(email).append("',").append(identityCard).append(")");
            //返回值是几行收到影响
            int num = st.executeUpdate(sb.toString());
            System.out.println(num);
            if(num>0){
                System.out.println("增加成功");
                return true;
            }else{
                System.out.println("增加失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            //关闭
            try {
                if(st!=null){
                    st.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                if(con!=null){
                    con.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return false;
    }


    /**
     * update student set studentname=++ ,sex=++ where studentno=++
     * delete from student where studentno=?
     * 获取所有的学生  select * from student
     * @return
     */
    public List<Student>  getAllStudents(){
        List<Student>list = new ArrayList<Student>();
        //加载驱动
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://127.0.0.1:3306/myschool";
            String user = "root";
            String password = "123456";
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
            rs = st.executeQuery("select * from student");
            while(rs.next()){
                int studentno = rs.getInt("studentno");
                String loginpwd = rs.getString("loginpwd");
                String studentname = rs.getString("studentname");
                //获取年月日时分秒
                Date bornDate = rs.getTimestamp("bornDate");
                Student s = new Student();
                s.setStudentno(studentno);
                s.setLoginpwd(loginpwd);
                s.setStudentname(studentname);
                s.setBornDate(bornDate);
                list.add(s);
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            //关闭
            try {
                if(rs!=null){
                    rs.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                if(st!=null){
                    st.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                if(con!=null){
                    con.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return list;
    }

    public boolean login(String studentname,String loginpwd){
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
            //?useUnicode=true&characterEncoding=utf8  jdbc和数据库交互数据的编码自己设置，设置成utf8
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/myschool?useUnicode=true&characterEncoding=utf8", "root", "123456");
            //执行sql语句
            st = con.createStatement();
            //得到结果集
            StringBuffer sql = new StringBuffer("select * from student where studentname='");
            sql.append(studentname).append("' and loginpwd='").append(loginpwd).append("'");
            System.out.println(sql);
            //executeQuery执行查询语句，executeUpdate执行增删改
            rs = st.executeQuery(sql.toString());
            if(rs.next()){
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            //关闭
            try {
                if(rs!=null){
                    rs.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                if(st!=null){
                    st.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                if(con!=null){
                    con.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return flag;
    }

    /**
     * prepareStatement  既安全，效率又高
     * @param studentname
     * @param loginpwd
     * @return
     */
    public boolean loginPre(String studentname,String loginpwd){
        boolean flag = false;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/myschool?useUnicode=true&characterEncoding=utf8", "root", "123456");
            //? 占位符
            String sql = "select * from student where studentname=? and loginpwd = ?";
            //预编译
            ps = con.prepareStatement(sql);
            //第一个参数是第几个问号，从1开始；第二个参数是代替问号的数据
            ps.setString(1, studentname);
            ps.setString(2, loginpwd);
            //不要写sql语句
            rs = ps.executeQuery();
            if(rs.next()){
                flag = true;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            //关闭
            try {
                if(rs!=null){
                    rs.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                if(ps!=null){
                    ps.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                if(con!=null){
                    con.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
        //Student stu = studentDaoImpl.getStudent(20000);
        //System.out.println(stu.getStudentname());
        //int studentno,String loginpwd,String studentname,String sex,int gradeid,String phone,String address,Date bornDate,String email,String identityCard
        //studentDaoImpl.addStudent(20016,"123","名字","男",2,"111111","合肥",new Date(),"11@qq.com",null);
		/*List<Student> list = studentDaoImpl.getAllStudents();
		for(Student s:list){
			System.out.println(s);
		}*/
        boolean flag = studentDaoImpl.loginPre("郭靖2222", "' or '1'='1");
        System.out.println(flag);
    }
}

