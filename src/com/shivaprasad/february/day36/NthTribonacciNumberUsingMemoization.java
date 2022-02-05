package com.shivaprasad.february.day36;

import java.util.Arrays;

public class NthTribonacciNumberUsingMemoization {

    public static void main(String[] args) {
        System.out.println(tribonacci(5));
    }

    public static int tribonacci(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return trib(n,dp);
    }

    private static int trib(int n, int[] dp) {
        if(n<=1)
            return n;
        if(n==2)
            return 1;

        if(dp[n]!=-1) return dp[n];
        return dp[n] = trib(n-1,dp) + trib(n-2,dp)+trib(n-3,dp);
    }
    //T.C: O(N)
    //S.C: O(N) + O(N) == O(N)
}
