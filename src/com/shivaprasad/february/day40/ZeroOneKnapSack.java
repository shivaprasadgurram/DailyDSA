package com.shivaprasad.february.day40;

import java.util.HashMap;

public class ZeroOneKnapSack {
    public static void main(String[] args) {

        int[] weights = {10,20,30};
        int[] values = {60,100,120};
        int capacity = 50;
        System.out.println(knapSack(capacity,weights,values,3));
    }

    static int knapSack(int W,int[] wt,int[] val,int n)
    {
        return maxProfit(wt,val,W,n,0,new HashMap<String,Integer>());
    }

    private static int maxProfit(int[] wt, int[] val, int w, int n, int currentIndex, HashMap<String, Integer> memo) {
        if (currentIndex >= n) return 0;

        String currentKey = currentIndex + "_" + w;

        if (memo.containsKey(currentKey))
            return memo.get(currentKey);

        int consider = 0;

        if (wt[currentIndex] <= w) {
            consider = val[currentIndex] + maxProfit(wt, val, w - wt[currentIndex], n, currentIndex + 1, memo);
        }
        int notConsider = maxProfit(wt, val, w, n, currentIndex + 1, memo);
        memo.put(currentKey, Math.max(consider, notConsider));

        return memo.get(currentKey);
    }
}
