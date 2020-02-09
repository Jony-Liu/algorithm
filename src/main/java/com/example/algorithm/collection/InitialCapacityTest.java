package com.example.algorithm.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;

/**
 * @author Jony-Liu
 * @date 2019-11-29
 */
public class InitialCapacityTest {
    @Test
    public void test() {
        ArrayList<String> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            list.add("" + i);
        }
        System.out.println(list.toString());
        Vector<String> vector = new Vector<>(10, 10);
        for (int i = 0; i < 15; i++) {
            vector.add("" + i);
        }
        //print 20
        System.out.println(vector.capacity());
        HashSet<String> hashSet = new HashSet<>(10);
        for (int i = 0; i < 15; i++) {
            vector.add("" + i);
        }
        System.out.println(hashSet.toString());
    }
}
