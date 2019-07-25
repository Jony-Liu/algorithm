package com.example.algorithm.annotation;

public class Person extends Creature<String> implements Comparable, MyInterface {

    String name;

    int age;

    public Person() {
        // TODO Auto-generated constructor stub
        System.out.println("无参构造器");
    }

    public Person(String name) {
        super();
        this.name = name;
    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    @MyAnnoation("atlzq")
    public void show(){
        System.out.println("Show [name=" + name + ", age=" + age + "]");
    }

    public void display(String nation){
        System.out.println("My address is"+nation);
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }
    class Bird{

    }
}
