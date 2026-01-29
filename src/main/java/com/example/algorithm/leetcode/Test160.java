package com.example.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 160.相交链表
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null 。
 */
public class Test160 {
    public static void main(String[] args) {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode temp = headA;
        while(temp!=null){
            set.add(temp);
            temp = temp.next;
        }
        temp = headB;
        while(temp!=null){
            if(set.contains(temp)){
                return temp;
            }else{
                temp = temp.next;
            }
        }
        return null;
    }



}


