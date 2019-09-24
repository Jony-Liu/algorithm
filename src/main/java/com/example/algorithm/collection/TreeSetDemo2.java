package com.example.algorithm.collection;


import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author Jony-Liu
 */
class MyComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        // TODO Auto-generated method stub
        if(o1 instanceof Book && o2 instanceof Book ){
            Book b1 = (Book)o1;
            Book b2 = (Book)o2;
            if(b1.getRent()>b2.getRent()){
                return 1;
            }else if(b1.getRent()<b2.getRent()){
                return -1;
            }else{
                return 0;
            }
        }else{
            throw new RuntimeException("参数错误！");
        }
    }

}

/**
 * @author Jony-Liu
 */
public class TreeSetDemo2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TreeSet t = new TreeSet(new MyComparator());
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
