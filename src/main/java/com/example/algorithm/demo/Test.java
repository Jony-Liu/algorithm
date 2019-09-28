package com.example.algorithm.demo;

import java.util.ArrayList;
import java.util.Vector;

/**
 * @author Jony-Liu
 * @date 2019/9/28 21:34
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("this is list");
        Vector<String> vector  = new Vector<>();
        vector.add("this is list");
        System.out.println(listOne.equals(vector));
    }
}
