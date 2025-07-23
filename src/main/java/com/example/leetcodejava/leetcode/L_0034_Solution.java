package com.example.leetcodejava.leetcode;

import java.util.Arrays;

public class L_0034_Solution {
    int[] nums = {5, 7, 7, 8, 8, 10};
    int target = 8;

    public int[] searchRange(int[] nums, int target) {
        int l = search(nums, target);
        int r = search(nums, target + 1);
        return l == r ? new int[] {-1, -1} : new int[] {l, r - 1};
    }

    private int search(int[] nums, int x) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] >= x) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        L_0034_Solution solution = new L_0034_Solution();
        int[] aa = solution.searchRange(solution.nums, solution.target);
        System.out.println(Arrays.toString(aa));
    }
}
