package com.example.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 54.螺旋矩阵
 * 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
 */
public class Test54 {

    public static void main(String[] args) {
        Test54 test = new Test54();
        int[][] matrix  = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        List<Integer> result = test.spiralOrder(matrix);
        for (Integer i:result) {
            System.out.print(i+" ");
        };
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int way = 1;
        int m = matrix.length;
        int n = matrix[0].length;
        int index_0 = 0;
        int index_1 = -1;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m*n ; ) {
            if(way==1){
                if(index_1+1<n&&visited[index_0][index_1+1]==false){
                    index_1 = index_1+1;
                    list.add(matrix[index_0][index_1]);
                    visited[index_0][index_1] = true;
                    i++;
                }else{
                    way = (way+1)%4;
                }
            }else if(way==2){
                if(index_0+1<m&&visited[index_0 + 1][index_1]==false){
                    index_0 = index_0 + 1;
                    list.add(matrix[index_0][index_1]);
                    visited[index_0][index_1] = true;
                    i++;
                }else{
                    way = (way+1)%4;
                }
            }else if(way==3){
                if(index_1-1>=0&&visited[index_0][index_1 - 1]==false){
                    index_1 = index_1 -1;
                    list.add(matrix[index_0][index_1]);
                    visited[index_0][index_1] = true;
                    i++;
                }else{
                    way = (way+1)%4;
                }
            }else if(way ==0){
                if(index_0-1>=0&&visited[index_0-1][index_1]==false){
                    index_0 = index_0 - 1;
                    list.add(matrix[index_0][index_1]);
                    visited[index_0][index_1] = true;
                    i++;
                }else{
                    way = (way+1)%4;
                }
            }
        }
        return list;
    }


}
