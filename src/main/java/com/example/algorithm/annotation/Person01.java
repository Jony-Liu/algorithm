package com.example.algorithm.annotation;

/**
 * @author Jony-Liu
 */
public class Person01 {

    public String name;

    @Override
    @MyTiger("注解")
    public String toString() {
        // TODO Auto-generated method stub
        return name;
    }

}