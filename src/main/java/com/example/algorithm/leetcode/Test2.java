package com.example.algorithm.leetcode;

/**
 * 2.两数相加
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 */
public class Test2 {

    public static void main(String[] args) {
        System.out.println(8/10);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long i = 1;
        long l1_sum = 0;
        while(l1!=null){
            l1_sum = l1_sum + l1.val*i;
            i = i * 10;
            l1 = l1.next;
        }
        long j = 1;
        long l2_sum = 0;
        while(l2!=null){
            l2_sum = l2_sum + l2.val*j;
            j = j * 10;
            l2 = l2.next;
        }
        long sum = l1_sum+l2_sum;
        ListNode head = new ListNode(0);
        if(sum == 0){
            return head;
        }
        ListNode temp = head;
        do{
            long m = sum%10;
            temp.next = new ListNode((int)m);
            temp = temp.next;
            sum = sum/10;
        }while (sum!=0);
        return head.next;
    }

    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode result  =new ListNode(0);
        ListNode temp = result;
        int next =0;
        while(l1!=null&&l2!=null){
            int sum = l1.val + l2.val + next;
            next = 0;
            if(sum >= 10){
                next = sum/10;
                sum = sum - 10;
            }
            temp.next = new ListNode(sum);
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null){
            int sum = l1.val + next;
            next = 0;
            if(sum >= 10){
                next = sum/10;
                sum = sum - 10;
            }
            temp.next = new ListNode(sum);
            temp = temp.next;
            l1 = l1.next;
        }
        while(l2!=null){
            int sum = l2.val + next;
            next = 0;
            if(sum >= 10){
                next = sum/10;
                sum = sum - 10;
            }
            temp.next = new ListNode(sum);
            temp = temp.next;
            l2 = l2.next;
        }
        if(next > 0 ){
            temp.next = new ListNode(next);
        }
        return result.next;
    }


    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode result  =new ListNode(0);
        ListNode temp = result;
        int next =0;
        while(l1!=null||l2!=null){
            int l1_val = l1==null?0:l1.val;
            int l2_val = l2==null?0:l2.val;
            int sum = l1_val + l2_val + next;
            next = 0;
            if(sum >= 10){
                next = sum/10;
                sum = sum - 10;
            }
            temp.next = new ListNode(sum);
            temp = temp.next;
            if(l1!=null){
                l1 = l1.next;
            }
            if(l2!=null){
                l2 = l2.next;
            }
        }
        if(next > 0 ){
            temp.next = new ListNode(next);
        }
        return result.next;
    }














}
