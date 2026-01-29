package com.example.algorithm.leetcode;

import com.example.algorithm.collection.LinkedListDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test206 {

    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        List<ListNode> list = new ArrayList<>();
        ListNode temp = head;
        while (temp!=null){
            list.add(temp);
            temp = temp.next;
        }
        int size = list.size();
        temp = list.get(size - 1);
        ListNode result = temp;
        if(size >= 2){
            for (int i = size - 2 ; i >= 0 ; i--) {
                temp.next = list.get(i);
                temp = temp.next;
            }
            temp.next = null;
        }
        return result;
    }


}
