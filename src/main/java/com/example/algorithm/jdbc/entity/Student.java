package com.example.algorithm.jdbc.entity;//实体

import java.util.Date;

public class Student {
	private int studentno;
	private String loginpwd;
	private String studentname;
	private String sex;
	private int gradeId;
	private String phone;
	private String address;
	private Date bornDate;
	private String email;
	private String identityCard;
	public Student(){}
	
	public Student(int studentno, String loginpwd, String studentname, String sex, int gradeId, String phone,
			String address, Date bornDate, String email, String identityCard) {
		super();
		this.studentno = studentno;
		this.loginpwd = loginpwd;
		this.studentname = studentname;
		this.sex = sex;
		this.gradeId = gradeId;
		this.phone = phone;
		this.address = address;
		this.bornDate = bornDate;
		this.email = email;
		this.identityCard = identityCard;
	}
	public int getStudentno() {
		return studentno;
	}
	public void setStudentno(int studentno) {
		this.studentno = studentno;
	}
	public String getLoginpwd() {
		return loginpwd;
	}
	public void setLoginpwd(String loginpwd) {
		this.loginpwd = loginpwd;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getGradeId() {
		return gradeId;
	}
	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBornDate() {
		return bornDate;
	}
	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIdentityCard() {
		return identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "studentno="+studentno+";studentname="+studentname;
	}
	

}
