package com.example.algorithm.rank;

import java.util.Arrays;

/**
 * 归并排序
 *
 * @author jonyliu
 * @date 2022/9/29 17:23
 */
public class MergeSort {

    public static int[] sort(int[] a, int low, int hight) {
        int mid = (low + hight) / 2;
        if (low < hight) {
            sort(a, low, mid);
            sort(a, mid + 1, hight);
            merge(a, low, mid, hight);
        }
        return a;
    }

    public static void merge(int[] a, int low, int mid, int hight) {
        int[] temp = new int[hight - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= hight) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        while (j <= hight) {
            temp[k++] = a[j++];
        }
        for (int x = 0; x < temp.length; x++) {
            a[x + low] = temp[x];
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 8, 9, 5, 12, 55, 89, 45};
        System.out.println(Arrays.toString(arr));
        sort(arr, 0, 9);
        System.out.println(Arrays.toString(arr));
    }

}
