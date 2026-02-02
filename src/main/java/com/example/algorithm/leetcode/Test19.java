package com.example.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Test19 {

    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> list =new ArrayList<>();
        ListNode temp =head;
        while(temp!=null){
            list.add(temp);
            temp = temp.next;
        }
        int index = list.size() - n;
        if(index==0){
            if(list.size()>1){
                return head.next;
            }
            return null;
        }else{
            if(index+1<list.size()){
                list.get(index-1).next = list.get(index+1);
            }else{
                list.get(index-1).next = null;
            }
        }
        return head;
    }

    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode dummy = new ListNode(0,head);
        Deque<ListNode> stack = new LinkedList<>();
        ListNode cur = dummy;
        while(cur!=null){
            stack.push(cur);
            cur = cur.next;
        }
        for(int i= 0;i<n;++i){
            stack.pop();
        }
        ListNode prev = stack.peek();
        prev.next = prev.next.next;
        ListNode ans = dummy.next;
        return ans;
    }

    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        int length = getLength(head);
        ListNode cur = dummy;
        for (int i = 1; i < length - n + 1; ++i) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        ListNode ans = dummy.next;
        return ans;
    }

    public int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            ++length;
            head = head.next;
        }
        return length;
    }


}
