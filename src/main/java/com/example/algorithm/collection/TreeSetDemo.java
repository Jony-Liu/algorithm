package com.example.algorithm.collection;


import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author Jony-Liu
 */
public class TreeSetDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TreeSet t = new TreeSet();
        t.add(new Book("书名1", 3));
        t.add(new Book("书名2", 6));
        t.add(new Book("书名3", 2));
        t.add(new Book("书名4", 4));
        Iterator i = t.iterator();
        while (i.hasNext()) {
            Book b= (Book)(i.next());
            System.out.println(b.getName());
        }
    }

}
