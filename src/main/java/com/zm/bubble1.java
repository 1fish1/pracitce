package com.zm;

public class bubble1 {
    public static int temp = 0;

    public static void main(String[] args) {

        int arr[] = {3, 38, 5, 15, 36, 26, 27, 2, 4, 19, 44, 46, 60, 45, 87, 19};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void swap(int arr[], int i, int j) {

        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    flag = false;

                }
            }
            if (flag) {
                break;
            }
        }
    }
}
