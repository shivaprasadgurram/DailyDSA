package com.shivaprasad.february.day36;

import java.util.Arrays;

public class FibonacciNumberUsingMemoization {

    public static void main(String[] args) {
        System.out.println(fib(7));
    }

    private static int fib(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return f(n,dp);
    }

    private static int f(int n, int[] dp) {
        if(n<=1)
            return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n] = f(n-1,dp) + f(n-2,dp);
    }

    //T.C: O(N)
    //S.C: O(N) + O(N) ≈ O(N)
}
