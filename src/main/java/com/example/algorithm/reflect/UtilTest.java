package com.example.algorithm.reflect;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class UtilTest {
    @Test
    public void test() {
        Student person = new Student("Tom","一年级",6);
        Student student = new Student();
        Set properties = new HashSet();
        ReflectionUtil.copyProperties(person, student, properties, false);
        System.out.println(person);
        System.out.println(student);
    }
}
