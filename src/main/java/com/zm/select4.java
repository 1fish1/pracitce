package com.zm;

public class select4 {

    public static void main(String[] args) {
        // 定义一个数组
        int arr[] = {3, 38, 5, 15, 36, 26, 27, 2, 4, 19, 44, 46, 60, 45, 87, 19};

        Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void Sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int k = i;
            for (int j = i + 1; j < arr.length; j++) {

                if(arr[k]>arr[j]){
                     k=j;
                }
            }
            if(k!=i){
                swap(arr,k,i);
            }
        }
    }
}
