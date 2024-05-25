package com.zm;

public class select1 {
    public static int temp = 0;

    public static void main(String[] args) {

        int arr[] = {3, 38, 5, 15, 36, 26, 27, 2, 4, 19, 44, 46, 60, 45, 87, 19};
//        selectionSort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            int emp = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[emp]) {
                    emp = j;
                }
            }
            if (emp != i) {
                temp = arr[i];
                arr[i] = arr[emp];
                arr[emp] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void selectionSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int minVal = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[minVal] > arr[j]) {
                    minVal = j;
                }
            }
            if (minVal != i) {
                int tmp = arr[i];
                arr[i] = arr[minVal];
                arr[minVal] = tmp;
            }
        }
    }


}
