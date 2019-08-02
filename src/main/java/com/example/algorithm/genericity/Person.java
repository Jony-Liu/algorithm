package com.example.algorithm.genericity;


public class Person {
    private String name;
    private int age;
    private String school;
    private String major;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String school) {
        super();
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public Person(String name, int age, String school, String major) {
        super();
        this.name = name;
        this.age = age;
        this.school = school;
        this.major = major;
    }

    public void show() {
        System.out.println("name:" + name + "\nage:" + age + "\nschool:" + school + "\nmajor:" + major);
    }

}
