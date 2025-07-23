package com.example.leetcodejava.zxl;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int[] ary = new int[]{1, 2, 10, 12, 3, 4, 5, 6};
        /*TODO 遍历数组 ----------------------------------😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄-------------------------------*/
        Arrays.stream(ary).forEach(item -> {
            System.out.println(item);
        });
        System.out.println("-------------------------");
        Arrays.stream(ary).map(item -> {
            System.out.println(item);
            return item * 2;
        }).toArray();
        System.out.println("-------------------------");
        /*TODO 访问数组 ----------------------------------😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄-------------------------------*/
        System.out.println(ary[0]);
        Arrays.sort(ary);
        Arrays.stream(ary).forEach(item -> {
            System.out.println(item);
        });
        System.out.println(5.6 + 3);
    }
}
