package com.shivaprasad.february.day36;

import java.util.Arrays;

public class NthTribonacciNumberUsingTabulation {
    public static void main(String[] args) {
        System.out.println(tribonacci(5));
    }

    static int tribonacci(int n)
    {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);

        if(n<=1)
            return n;
        if(n==2)
            return 1;

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        for(int i=3;i<=n;i++)
        {
            dp[i] = dp[i-1] + dp[i-2]+dp[i-3];
        }

        return dp[n];

        //T.C: O(N)
        //S.C: O(N)
    }
}
