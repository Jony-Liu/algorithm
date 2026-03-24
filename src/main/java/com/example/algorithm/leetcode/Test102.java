package com.example.algorithm.leetcode;

import java.util.*;

/**
 * 102.二叉树的层序遍历
 */
public class Test102 {

    public static void main(String[] args) {

    }
    Map<Integer, List<Integer>> map;
    public List<List<Integer>> levelOrder(TreeNode root) {
        map = new HashMap<>();
        if(root==null){
            return new ArrayList<>();
        }
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(root.val);
        map.put(1, list1);
        test(root, 1);
        Set<Integer> set = map.keySet();
        for (Integer i:set){
            list.add(map.get(i));
        }
        return list;
    }

    public void test(TreeNode node,int k){
        List<Integer> list = null;
        if(node.left!=null){
            if(map.get(k+1) == null){
                list = new ArrayList<>();
                list.add(node.left.val);
            }else{
                list = map.get(k + 1);
                list.add(node.left.val);
            }
            map.put(k + 1, list);
        }
       if(node.right!=null){
           if(map.get(k+1) == null){
               list = new ArrayList<>();
               list.add(node.right.val);
           }else{
               list = map.get(k + 1);
               list.add(node.right.val);
           }
           map.put(k + 1, list);
       }
       if(node.left!=null){
           test(node.left, k + 1);
       }
        if(node.right!=null){
            test(node.right, k + 1);
        }
    }

}
