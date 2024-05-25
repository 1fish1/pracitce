package com.zm.nine;

public class first {
    public static void main(String[] args) {


    }

    public static int num(int arr[]) {
        int left = 0, right = 0, sum = 0;
        for (int i = 1; i < arr.length - 1; i++) {


            if (left <= arr[i]) {
                left = arr[i];
            }
            if (right >= arr[i]) {
                right = arr[i];
            }

        }
        return 0;
    }
}

