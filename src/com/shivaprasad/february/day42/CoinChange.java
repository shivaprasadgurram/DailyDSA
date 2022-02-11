package com.shivaprasad.february.day42;

import java.util.Arrays;

public class CoinChange {

    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1,2,5},11));
    }
    public static int coinChange(int[] coins, int amount) {

        int[] dp=new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE-1);
        dp[0]=0;
        for(int i=0;i<coins.length;i++){
            for(int j=coins[i];j<=amount;j++){
                dp[j]=Math.min(dp[j],dp[j-coins[i]]+1);
            }
        }
        return dp[amount]>=Integer.MAX_VALUE-1?-1:dp[amount];
    }
}
