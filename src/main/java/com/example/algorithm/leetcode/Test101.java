package com.example.algorithm.leetcode;

/**
 * 101.对称二叉树
 */
public class Test101 {

    public static void main(String[] args) {

    }

    /**
     * XXXXXXXXXXXXXXXXXXXXXXXX答案错误XXXXXXXXXXXXXXXXXXXXXXXX
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return false;
        }
        boolean left = isSymmetric(root.left);
        boolean right = isSymmetric(root.right);
        if(right == left){
            return true;
        }
        return false;
    }

    public boolean isSymmetric1(TreeNode root) {
        return check(root.left,root.right);
    }

    public static boolean check(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }
}
