package com.shivaprasad.february.day46;

import java.util.HashMap;

public class BestTimeToBuyAndSellStockII {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
    public static int maxProfit(int[] prices) {
        return maxProfit(prices,0,1,new HashMap<String,Integer>());
    }

   static int maxProfit(int[] prices,int currentDay,int canBuy,HashMap<String,Integer> memo)
    {
        if(currentDay >= prices.length)
            return 0;

        String currentKey = currentDay+"_"+canBuy;

        if(memo.containsKey(currentKey))
            return memo.get(currentKey);

        if(canBuy == 1)
        {
            int idle = maxProfit(prices,currentDay+1,canBuy,memo);
            int buy = -prices[currentDay] + maxProfit(prices,currentDay+1,0,memo);
            memo.put(currentKey,Math.max(idle,buy));
        }
        else
        {
            int idle = maxProfit(prices,currentDay+1,canBuy,memo);
            int sell = prices[currentDay] + maxProfit(prices,currentDay+1,1,memo);
            memo.put(currentKey,Math.max(idle,sell));
        }

        return memo.get(currentKey);
    }


}
