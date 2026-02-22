package com.example.algorithm.leetcode;

/**
 * 33.搜索旋转排序数组
 * 在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了 向左旋转，使数组变为 [nums[k],
 * nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]（下标 从 0 开始 计数）。
 * 例如， [0,1,2,4,5,6,7] 下标 3 上向左旋转后可能变为 [4,5,6,7,0,1,2] 。
 *
 * 给你 旋转后 的数组 nums 和一个整数 target ，如果 nums 中存在这个目标值 target ，则返回它的下标，否则返回 -1 。
 * 你必须设计一个时间复杂度为 O(log n) 的算法解决此问题。
 */
public class Test33 {

    public static void main(String[] args) {
        int[] nums = {1}; //[0,1,2,4,5,6,7] -- 》 [6,7 0,  1,2,4,5,
        int target = 0;
        Test33 test = new Test33();
        System.out.println(test.search(nums, target));
    }

    public int search(int[] nums, int target) {
        int n = nums.length;
        if(n==0){
            return -1;
        }
        int left = 0;
        int right = n - 1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[left]<=nums[mid]){
                if(nums[left]<= target&&target<nums[mid]){
                    right = mid - 1;
                }else{
                    left = mid +  1;
                }
            }else{
                if(nums[mid+1] <= target && target<=nums[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    /**
     * 官方解答，其中  nums[0] 和   nums[n - 1] 只是为了判断 某个下标 k 的位置，不容易理解
     * @param nums
     * @param target
     * @return
     */
    public int search1(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) {
            return -1;
        }
        if (n == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[0] <= nums[mid]) {
                if (nums[0] <= target && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[n - 1]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
}
