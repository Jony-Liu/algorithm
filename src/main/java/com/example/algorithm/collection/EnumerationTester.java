package com.example.algorithm.collection;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author jonyliu
 */
public class EnumerationTester {

    public static void main(String[] args) {
        Enumeration<String> days;
        Vector<String> vector = new Vector<>();
        vector.add("Sunday");
        vector.add("Monday");
        vector.add("Tuesday");
        vector.add("Wednesday");
        vector.add("Thursday");
        vector.add("Friday");
        vector.add("Saturday");
        days = vector.elements();
        while (days.hasMoreElements()) {
            System.out.println(days.nextElement());
        }
    }

}
