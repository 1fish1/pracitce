package com.zm;

public class inset2 {
    public static void main(String[] args) {
        // 定义一个数组
        int arr[] = {3, 38, 5, 15, 36, 26, 27, 2, 4, 19, 44, 46, 60, 45, 87, 19};

        inset(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void inset(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int emp = arr[i], j = i;
            while (j > 0 && emp > arr[j - 1]) {
                arr[j] = arr[j - 1]; // 后一个或者前一个 往后或往前插数据
                j--;
            }
            arr[j] = emp;
        }
    }
}
