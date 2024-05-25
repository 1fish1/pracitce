package com.zm.leetcode;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("输入一个数字");
            int num = input.nextInt();
            System.out.println(huiwen(num));
        }


    }

    public static boolean huiwen(int x) {
        if(x<0) return false;
        String s = String.valueOf(x); //将数字转为为字符串
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
                return false;
        }
        return true;
    }
}
