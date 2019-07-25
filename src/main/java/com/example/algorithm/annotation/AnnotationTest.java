package com.example.algorithm.annotation;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationTest {

    @Test
    public void test01() throws Exception {
        Method method = Person.class.getMethod("show");
        MyAnnoation myAnnoation = method.getAnnotation(MyAnnoation.class);
        System.out.println(myAnnoation.value());//print atlzq
    }

    @Test
    public void test() throws Exception {
        Annotation[] ann = Class.forName("com.example.algorithm.annotation.Person01").getMethod("toString").getAnnotations();
        //ann =Class.forName("com.example.algorithm.annotation.Test").getMethod("toString").getAnnotations();
        for (Annotation annotation : ann) {
            System.out.println(annotation);
        }
    }
}
