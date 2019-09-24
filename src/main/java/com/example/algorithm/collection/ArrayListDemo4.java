package com.example.algorithm.collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Jony-Liu
 */
public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add("a");
        arr.add("a");
        arr.add("a");
        arr.add(1);
        arr.add(2);
        // 遍历
        for (Object k : arr) {
            System.out.println(k.toString());
        }
        arr.remove(1);
        // 遍历
        System.out.println("-------------");
        for (Object k : arr) {
            System.out.println(k.toString());
        }
        arr.remove("a");
        // 遍历
        System.out.println("-------------");
        for (Object k : arr) {
            System.out.println(k.toString());
        }
        System.out.println("-------------");

        Object[] o = arr.toArray();
        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i]);
        }
        System.out.println("-------------");
        Iterator i = arr.iterator();
        while (i.hasNext()) {
            //Object ob = i.next();
            System.out.println(i.next());
        }
    }
}
