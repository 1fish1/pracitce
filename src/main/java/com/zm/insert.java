package com.zm;

public class insert {
    public static void main(String[] args) {

        int arr[] = {3, 38, 5, 15, 36, 26, 27, 2, 4, 19, 44, 46, 60, 45, 87, 19};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int emp = arr[i], j = i;
            while (j > 0 && emp< arr[j - 1]) {
                 arr[j] = arr[j - 1];  // 往前移动一位
                 j--;  // 小型递归
            }
            arr[j] = emp;
        }
    }
}
