package com.zm.leetcode;

import java.util.Scanner;

public class removeAlmostEqualCharacters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();  // 输入字符串

        int num = 0;  // 次数

        for (int i = 0; i < str.length() - 1; i++) {
            if (Math.abs(str.charAt(i) - str.charAt(i + 1)) <= 1) {
                num++;
                i++;
            }
        }
        System.out.println(num);
    }
}
