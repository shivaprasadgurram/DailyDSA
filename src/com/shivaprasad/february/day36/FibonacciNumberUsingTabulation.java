package com.shivaprasad.february.day36;

import java.util.Arrays;

public class FibonacciNumberUsingTabulation {

    public static void main(String[] args) {
        System.out.println(fib(7));
    }

    public static int fib(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);

        if(n>=2)
        {
            dp[0] = 0;
            dp[1] = 1;

            for(int i=2;i<=n;i++)
            {
                dp[i] = dp[i-1] + dp[i-2];
            }
            return dp[n];
        }
        return n;
    }

    //T.C: O(N)
    //S.C: O(N)
}
