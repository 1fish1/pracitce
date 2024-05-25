package com.zm.leetcode;

import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String A = in.nextLine();  // 输入字符串

        String B = in.nextLine();  // 输入字符串


        System.out.println(len(A, B));
    }

    public static int len(String A, String B) {
        int N = A.length();
        int M = B.length();
        int i;
        for ( i = 0; i <= N - M; i++) {
            int j;
            for (j = 0; j < M; j++) {

//                if (A.charAt(j) == B.charAt(i + j)) {
//                    if (j == M) {
//                        System.out.println(i);
//                    }
//                } else {
//                    break;
//                }
                char C = A.charAt(j);
                char D = A.charAt(j);
                if (C != D) {
                    break;
                }

            }
            if (j == M) {
                return i;
            }
        }
        return -1;
    }


}
