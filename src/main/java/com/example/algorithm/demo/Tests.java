package com.example.algorithm.demo;

import java.util.Arrays;
import java.util.List;

/**
 * @author Jony-Liu
 * @date 2019/9/28 21:20
 */
public class Tests {
    public static void main(String[] args) {
        int[] test = new int[]{1, 2, 3, 4};
        List list = Arrays.asList(test);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println("-------------");
        Integer[] integers = new Integer[]{1, 2, 3, 4};
        list = Arrays.asList(integers);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println();
    }
}
