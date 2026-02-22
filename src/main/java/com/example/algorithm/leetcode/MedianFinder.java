package com.example.algorithm.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianFinder {
    private PriorityQueue<Integer> queMin ;
    private PriorityQueue<Integer> queMax;

    public MedianFinder() {
        queMin = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        queMax = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
    }

    public void addNum(int num) {
        if(queMin.isEmpty()||num<=queMin.peek()){
            queMin.offer(num);
            if(queMax.size()+1<queMin.size()){
                queMax.offer(queMin.poll());
            }
        }else{
            queMax.offer(num);
            if(queMin.size()<queMax.size()){
                queMin.offer(queMax.poll());
            }
        }
    }

    public double findMedian() {
        if(queMin.size()>queMax.size()){
            return queMin.peek();
        }
        return (queMax.peek()+queMin.peek())/2.0;
    }

}
