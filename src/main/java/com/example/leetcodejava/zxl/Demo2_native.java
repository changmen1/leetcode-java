package com.example.leetcodejava.zxl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Demo2_native {
    //

    /**
     * 输入：nums = [3,2,4], target = 6
     * 输出：[1,2]
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {1, 7, 9, 3, 2, 4};
        int target = 6;
        int[] data = twoSum(nums, target);
        System.out.println(Arrays.toString(data));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // 用于存储数字及其索引
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // 计算需要的补数
            // 如果补数已经存在于 HashMap 中，返回结果
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            // 否则，将当前数字及其索引存入 HashMap
            map.put(nums[i], i);
            System.out.println(map.toString());
        }
        return new int[]{}; // 题目保证有解，理论上不会执行到这里
    }
}
