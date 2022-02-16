package com.shivaprasad.february.day47;

import java.util.HashMap;

public class BestTimeToBuyAndSellStockIV {

    public static void main(String[] args) {
        System.out.println(maxProfit(2,new int[]{3,2,6,5,0,3}));
    }

    static int maxProfit(int k, int[] prices) {
        return maxProfit(prices,0,1,k,new HashMap<String,Integer>());
    }
    static int maxProfit(int[] prices,int currentDay,int canBuy,int transCount,HashMap<String,Integer> memo)
    {
        if(currentDay >= prices.length || transCount <= 0)
            return 0;

        String currentKey = currentDay+"_"+canBuy+"_"+transCount;

        if(memo.containsKey(currentKey))
            return memo.get(currentKey);

        if(canBuy == 1)
        {
            int idle = maxProfit(prices,currentDay+1,canBuy,transCount,memo);
            int buy = -prices[currentDay] + maxProfit(prices,currentDay+1,0,transCount,memo);
            memo.put(currentKey,Math.max(idle,buy));
        }
        else
        {
            int idle = maxProfit(prices,currentDay+1,canBuy,transCount,memo);
            int sell = prices[currentDay] + maxProfit(prices,currentDay+1,1,transCount-1,memo);
            memo.put(currentKey,Math.max(idle,sell));
        }

        return memo.get(currentKey);
    }
}
