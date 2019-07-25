package com.example.algorithm.annotation;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationTest {

    @Test
    public void test01() throws Exception {
        Method showMethod = Person.class.getMethod("show");
        MyAnnoation myAnnoation = showMethod.getAnnotation(MyAnnoation.class);
        System.out.println("val:"+myAnnoation.val()+"----str:"+myAnnoation.str());

        Method displayMethod = Person.class.getMethod("display",String.class);
        myAnnoation = displayMethod.getAnnotation(MyAnnoation.class);
        System.out.println("val:"+myAnnoation.val()+"----str:"+myAnnoation.str());

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
