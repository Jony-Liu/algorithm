package com.example.algorithm.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Jony-Liu
 */
public class Test01 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        ArrayList arr = new ArrayList();
        for (int i = 0; i < 10; i++) {
            Integer num = in.nextInt();
            arr.add(num);
        }
        Collections.sort(arr);
        Collections.reverse(arr);
        Iterator iterator = arr.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
