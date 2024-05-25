package com.zm.leetcode;

public class twoSum {
    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
//        int arr[] = new int[2];
        int target = 13;
//        for (int i = 0; i < nums.length; i++) {
//
//            for (int j = i + 1; j < nums.length - 1; j++) {
//                if (nums[j] + nums[i] == target) {
//                    arr[0] = j;
//                    arr[1] = i;
//                }
//
//            }
//        }
//        System.out.println(arr[0] + "  ----" + arr[1]);
        System.out.println(twoSum(nums,target));
    }
    public static int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[j] + nums[i] == target) {
                    arr[0] = j;
                    arr[1] = i;
                }

            }
        }
        return arr;
    }
}
