package com.example.algorithm.reflect.demo.field;

/**
 * @author Jony-Liu
 * @date 2020/5/20 22:32
 */
public class Student {
    public Student(){
    }
    //**********字段*************//
    public String name;
    protected int age;
    char sex;
    private String phoneNum;
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", sex=" + sex
                + ", phoneNum=" + phoneNum + "]";
    }
}
