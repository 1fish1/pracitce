package com.zm;

public class qingwa {

    public static void main(String[] args) {

        int n = 10;
        System.out.println(numWays(10));

        if (n <= 1) {
        }
        if (n == 2) {
        }
        int a = 1;
        int b = 2;
        int temp = 0;
        for (int i = 3; i <= n; i++) {
            temp = (a + b) % 1000000007;
            a = b;
            b = temp;
        }
        System.out.println(temp);
    }
    public static int numWays(int n) {
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return numWays(n-1) + numWays(n-2);
    }

}
