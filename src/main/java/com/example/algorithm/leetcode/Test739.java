package com.example.algorithm.leetcode;


import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 739.每日温度
 *
 * 给定一个整数数组 temperatures ，表示每天的温度，返回一个数组 answer ，其中 answer[i] 是指对于第 i 天，下一个更高温度出现在几天后。如果气温在这之后都不会升高，请在该位置用 0 来代替。
 *
 */
public class Test739 {

    public static void main(String[] args) {
        Test739 test = new Test739();
        int[] tem = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] ans = test.dailyTemperatures1(tem);
        System.out.println(Arrays.toString(ans));
    }

    /**
     * xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx超时了xxxxxxxxxxxxxxxxxxx
     * @param temperatures
     * @return
     */
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int start = i + 1;
            int num = 0;
            while(start<n){
                if(temperatures[start]>temperatures[i]){
                    ans[i] = ++num;
                    break;
                }else{
                    num++;
                }
                start++;
            }
        }
        return ans;
    }

    public int[] dailyTemperatures1(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < n; i++) {
           while(!deque.isEmpty()&&temperatures[i]>temperatures[deque.peek()]){
                int num = i - deque.peek();
                ans[deque.peek()]=num;
                deque.pop();
            }
           deque.push(i);
        }
        return ans;
    }

}
