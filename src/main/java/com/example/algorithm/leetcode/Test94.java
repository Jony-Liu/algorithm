package com.example.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Test94 {

    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        middleRank(root, list);
        return list;
    }

    public static void middleRank(TreeNode tree,List<Integer> list){
        if(tree==null){
            return;
        }
        middleRank(tree.left,list);
        list.add(tree.val);
        middleRank(tree.right,list);
    }


}
