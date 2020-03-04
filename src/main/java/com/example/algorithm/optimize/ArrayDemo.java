package com.example.algorithm.optimize;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jony-Liu
 * @date 2019/12/16 9:33
 */
public class ArrayDemo {
    @Test
    public void test(){
        String[] strings = {"a","b","c","d"};
        System.out.println(strings.toString());
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list.toString());
    }
}
