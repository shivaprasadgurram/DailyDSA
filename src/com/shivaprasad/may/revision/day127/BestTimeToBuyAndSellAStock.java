package com.shivaprasad.may.revision.day127;

import java.util.HashMap;

public class BestTimeToBuyAndSellAStock {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public static int maxProfit(int[] prices) {
        return maxProfit(prices,0,1,1,new HashMap<String,Integer>());
    }

    static int maxProfit(int[] prices, int currentDay, int canBuy, int transCount, HashMap<String,Integer> memo)
    {
        if(currentDay >= prices.length || transCount <=0)
            return 0;
        String currentKey = currentDay+"_"+canBuy+"_"+transCount;
        if(memo.containsKey(currentKey))
            return memo.get(currentKey);
        int idle = maxProfit(prices,currentDay+1,canBuy,transCount,memo);
        if(canBuy == 1) {
            int buy = -prices[currentDay] + maxProfit(prices,currentDay+1,0,transCount,memo);
            memo.put(currentKey,Math.max(idle,buy));
        } else {
            int sell = prices[currentDay] + maxProfit(prices,currentDay+1,1,transCount-1,memo);
            memo.put(currentKey,Math.max(idle,sell));
        }
        return memo.get(currentKey);
    }
}
