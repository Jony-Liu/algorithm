package com.example.algorithm.annotation;

import java.lang.annotation.Annotation;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        Annotation[] ann = Class.forName("com.example.algorithm.annotation.Person").getMethod("toString").getAnnotations();
        //ann =Class.forName("com.example.algorithm.annotation.Test").getMethod("toString").getAnnotations();
        for (Annotation annotation : ann) {
            System.out.println(annotation);
        }
    }
}
