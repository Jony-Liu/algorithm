package com.example.algorithm.genericity;

public class Boy extends Person {

    public Boy(String name, int age) {
        super(name, age);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.getName();
    }

    public void shout() {
        System.out.println("Hi!");
    }
}
