package com.zm.dpLearn;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class fiboClass01 {
    public static void main(String[] args) {
        System.out.println("请输入你要查找fibo 第几位的数");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        long startTime = System.currentTimeMillis();

        System.out.println("请输入你要查找fibo " + fiboDP(num));
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) / 1000 + "ms");

        long startTime1 = System.currentTimeMillis();
        System.out.println("请输入你要查找fibo " + fibo(num));
        long endTime1 = System.currentTimeMillis();
        System.out.println((endTime1 - startTime1) / 1000 + "ms");
    }

    private static int fiboDP(int n) {
//        int f[] = new int[n+2]; /*处理0或1*/
//
//        f[0] = 0; //f(0) == 0
//        f[1] = 1; //(f1) == 1
//
//        for(int i = 2; i<=n; i++)
//        {
//            f[i] = f[i-1]+f[i-2];
//        }
//        return f[n];

        int a = 1, b = 0, c;
        if (n == 1 || n == 2) {
            return a;
        } else {
            for (int i = 1; i < n; i++) {
                c = a + b;
                b = a;
                a = c;

            }
            return a;
        }
    }

    private static int fibo(int n) {
        if (n <= 1)
            return n;
        return fibo(n - 1) + fibo(n - 2);
    }
}
