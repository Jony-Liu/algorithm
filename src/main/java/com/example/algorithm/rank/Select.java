package com.example.algorithm.rank;

import java.util.Arrays;

/**
 * 选择排序
 */
public class Select {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {5, 4, 9, 8, 7, 6, 3, 2};
        System.out.println(arr.length);
        for (int i = 0; i < arr.length - 1; i++) {//控制每一轮选择;
            int temp;
            for (int k = i + 1; k < arr.length; k++) {//控制每轮选择的次数
                if (arr[i] > arr[k]) {
                    temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
