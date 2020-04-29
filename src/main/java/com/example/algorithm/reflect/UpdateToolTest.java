package com.example.algorithm.reflect;

import org.junit.Test;

/**
 * @author Jony-Liu
 */
public class UpdateToolTest {

    @Test
    public void test() {
        Person person01 = new Person("Person01", 23);
        Person person02 = new Person();
        person02.setName(null);
        System.out.println("person01:" + person01);
        System.out.println("persong02:" + person02);
        UpdateTool.copyNullProperties(person01, person02);
        System.out.println("----------------------------------");
        System.out.println("person01:" + person01);
        System.out.println("persong02:" + person02);
    }
}
