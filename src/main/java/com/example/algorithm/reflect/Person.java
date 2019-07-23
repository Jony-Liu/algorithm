package com.example.algorithm.reflect;

public class Person {

    private String name;
    public int age;

    public Person() {
        name = "Jony";
        age = 23;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name:" + name + "  age:" + age;
    }

    public void show() {
        System.out.println("name:" + name + "  age:" + age);
    }

    private void show(String name) {
        System.out.println(name);
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
    
}
