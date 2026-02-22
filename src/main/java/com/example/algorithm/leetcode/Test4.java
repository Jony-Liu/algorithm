package com.example.algorithm.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 4.寻找两个正序数组的中位数
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 *
 * 算法的时间复杂度应该为 O(log (m+n))
 */
public class Test4 {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList();
        queue.add(1);
        queue.add(2);
        /*while(queue.peek()!=null){
            System.out.println(queue.poll());
        }
        System.out.println(queue.peek());*/

       int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        Test4 test = new Test4();
        System.out.println( test.findMedianSortedArrays2(nums1, nums2));
    }


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        int m =nums1.length;
        int n = nums2.length;
        int index_1 = 0;
        int index_2 = 0;
        while(index_1<m||index_2<n){
            if(index_1<m&&index_2<n){
                if(nums1[index_1]<=nums2[index_2]){
                    list.add(nums1[index_1]);
                    index_1 ++;
                }else{
                    list.add(nums2[index_2]);
                    index_2 ++;
                }
            }else if (index_1 <m && index_2 >= n){
                list.add(nums1[index_1]);
                index_1 ++ ;
            }else if (index_1 >= m && index_2<n){
                list.add(nums2[index_2]);
                index_2++;
            }
        }
        int mid = list.size()/2;
        int mod = list.size()%2;
        double result = 0.0;
        if(mod == 0){
            result = (double)(list.get(mid)+list.get(mid-1))/2.0;
        }else{
            result = list.get(mid);
        }
        return result;
    }


    public double findMedianSortedArrays1(int[] nums1, int[] nums2) {
        int sum = nums1.length + nums2.length;
        int mul = sum/2;
        int mod = sum%2;
        Queue<Integer> queue = new LinkedList();
        if(mod==0){
            queue.add(mul - 1);
            queue.add(mul);
        }else{
            queue.add(mul);
        }
        int m =nums1.length;
        int n = nums2.length;
        int index_1 = 0;
        int index_2 = 0;
        int index = -1;
        double result_sum = 0;
        while(queue.peek()!=null){
            if(index_1<m&&index_2<n){
                if(nums1[index_1]<=nums2[index_2]){
                    index = index + 1;
                    if(queue.peek()==index){
                        result_sum = result_sum + nums1[index_1];
                        queue.poll();
                    }
                    index_1 ++;
                }else{
                    index = index+1;
                    if(queue.peek()==index){
                        result_sum = result_sum + nums2[index_2];
                        queue.poll();
                    }
                    index_2 ++;
                }
            }else if (index_1 <m && index_2 >= n){
                index = index+1;
                if(queue.peek()==index){
                    result_sum = result_sum + nums1[index_1];
                    queue.poll();
                }
                index_1 ++ ;
            }else if (index_1 >= m && index_2<n){
                index = index+1;
                if(queue.peek()==index){
                    result_sum = result_sum + nums2[index_2];
                    queue.poll();
                }
                index_2++;
            }
        }
        if(mod==0){
            return result_sum/2;
        }
        return result_sum;
    }


    public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int sum = nums1.length + nums2.length;
        int mul = sum/2;
        int mod = sum%2;
        int[] array = new int[]{};
        if(mod==0){
            array = new int[]{mul-1,mul};
        }else{
            array = new int[]{mul};
        }
        int m = nums1.length;
        int n = nums2.length;
        int index_1 = 0;
        int index_2 = 0;
        int index = -1;
        double result_sum = 0;
        for (int i = 0;i<array.length;){
            if(index_1<m&&index_2<n){
                if(nums1[index_1]<=nums2[index_2]){
                    index = index + 1;
                    if(array[i]==index){
                        result_sum = result_sum + nums1[index_1];
                        i++;
                    }
                    index_1 ++;
                }else{
                    index = index+1;
                    if(array[i]==index){
                        result_sum = result_sum + nums2[index_2];
                        i++;
                    }
                    index_2 ++;
                }
            }else if (index_1 <m && index_2 >= n){
                index = index+1;
                if(array[i]==index){
                    result_sum = result_sum + nums1[index_1];
                    i++;
                }
                index_1 ++ ;
            }else if (index_1 >= m && index_2<n){
                index = index+1;
                if(array[i]==index){
                    result_sum = result_sum + nums2[index_2];
                    i++;
                }
                index_2++;
            }
        }
        if(mod==0){
            return result_sum/2;
        }else{
            return result_sum;
        }
    }

}
