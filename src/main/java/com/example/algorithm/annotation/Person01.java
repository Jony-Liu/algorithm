package com.example.algorithm.annotation;


public class Person01 {

    public String name;

    @Override
    @MyTiger("注解")
    public String toString() {
        // TODO Auto-generated method stub
        return name;
    }

}