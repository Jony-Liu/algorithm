package com.example.algorithm.leetcode;

import java.util.*;

/**
 * 前K个高频元素
 */
public class Test347 {
    public static void main(String[] args) {
        Integer number1 = 5;
        Integer number2 = 3;
        int value =  number1.compareTo(number2);
        System.out.println(value);
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            public int compare(Integer m, Integer n) {
                return n-m;
            }
        });
        queue.offer(5);
        queue.offer(30);
        queue.offer(40);
        queue.offer(35);
        System.out.println(queue.peek());
        System.out.println("-------------------");
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        System.out.println("-----------------------");
        Test347 test = new Test347();
        int[] nums = {1,2,1,2,1,2,3,1,3,2};
        int k = 2;
        int[] result=  test.topKFrequent(nums, k);
        System.out.println(Arrays.toString(result));

    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        //int[]  num count
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>(new Comparator<int[]>() {
            public int compare(int[] m, int[] n) {
                return m[1]-n[1];
            }
        });
        for(Map.Entry<Integer, Integer> m :map.entrySet()){
            int num = m.getKey();
            int count = m.getValue();
            if(queue.size() == k){
                if(queue.peek()[1]<count){
                    queue.poll();
                    queue.offer(new int[]{num, count});
                }
            }else{
                queue.offer(new int[]{num, count});
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = queue.poll()[0];
        }
        return result;
    }


}
