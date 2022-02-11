package com.shivaprasad.february.day42;

import java.util.HashMap;

public class CoinChangeII {

    public static void main(String[] args) {
        System.out.println(change(5,new int[]{1,2,5}));
    }

    public static int change(int amount, int[] coins) {
        return totalWays(coins, 0, amount, new HashMap<String,Integer>());
    }

    public static int totalWays(int[] coins, int currentIndex, int amount, HashMap<String,Integer> memo){
        if(amount==0)
            return 1;
        if(currentIndex >= coins.length)
            return 0;

        String currentKey = currentIndex + "_" + amount;

        if(memo.containsKey(currentKey)){
            return memo.get(currentKey);
        }

        int consider = 0;
        if(coins[currentIndex] <= amount){
            consider = totalWays(coins, currentIndex, amount - coins[currentIndex], memo);
        }

        int notConsider = totalWays(coins, currentIndex + 1, amount, memo);

        memo.put(currentKey, consider + notConsider);

        return memo.get(currentKey);
    }
}
