package com.example.algorithm.leetcode;

import java.util.*;

/**
 * 56.合并区间
 * 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。
 * 请你合并所有重叠的区间，并返回 一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间
 */
public class Test56 {
    public static void main(String[] args) {
        Test56 test = new Test56();
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = test.merge(intervals);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0]+" "+result[i][1]);
        }



    }

    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        //排序
        Map<Integer,int[]> treeSet = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for (int i = 0; i < intervals.length ; i++) {
            int[] value = intervals[i];
            int[] ii = treeSet.get(value[0]);
            if(ii==null){
                ii = value;
            }else{
                if(ii[1]<value[1]){
                    ii[1] = value[1];
                }
            }
            treeSet.put(value[0], ii);
        }
        Set<Map.Entry<Integer,int[]>> set = treeSet.entrySet();
        Iterator<Map.Entry<Integer,int[]>> iterator =  set.iterator();
        int current_start = Integer.MIN_VALUE;
        int current_end = Integer.MIN_VALUE;
        while(iterator.hasNext()){
            Map.Entry<Integer,int[]> m = iterator.next();
            int[] current_double =  m.getValue();
            if(current_start == Integer.MIN_VALUE && current_end == Integer.MIN_VALUE){
                current_start = current_double[0];
                current_end = current_double[1];
            }else{
                if(current_double[0]<=current_end){//存在重叠
                    if(current_double[1]>current_end){
                        current_end = current_double[1];
                    }
                }else{
                    list.add(new int[]{current_start, current_end});
                    current_start = current_double[0];
                    current_end = current_double[1];
                }
            }
        }
        list.add(new int[]{current_start, current_end});
        int[][] result =  list.toArray(new int[0][]);
        return result;
    }

}
