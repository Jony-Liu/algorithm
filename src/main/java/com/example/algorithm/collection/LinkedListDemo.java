package com.example.algorithm.collection;


import java.util.LinkedList;

/**
 * @author Jony-Liu
 */
public class LinkedListDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LinkedList lk = new LinkedList();
        //在链表尾部添加元素
        lk.add("a");
        lk.add("a");
        lk.add(10);
        lk.addFirst("b");//在首位添加元素
        //遍历
        System.out.println("------------");
        for(Object k:lk){
            System.out.println(k);
        }
        lk.add(1, "b");//在指定位置添加元素
        //遍历
        System.out.println("------------");
        for(Object k:lk){
            System.out.println(k);
        }
        System.out.println("------------");
        System.out.println(lk.peek());//获取但不移除此列表的头（第一个元素）。
        lk.poll();//获取并移除此列表的头（第一个元素）
        //遍历
        System.out.println("------------");
        for(Object k:lk){
            System.out.println(k);
        }
    }

}
