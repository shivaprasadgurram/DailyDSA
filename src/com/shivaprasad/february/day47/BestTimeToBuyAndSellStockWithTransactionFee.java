package com.shivaprasad.february.day47;

import java.util.HashMap;

public class BestTimeToBuyAndSellStockWithTransactionFee {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1,3,2,8,4,9},2));
    }

    static int maxProfit(int[] prices, int fee) {
        return maxProfit(prices,0,1,new HashMap<String,Integer>(),fee);
    }

    static int maxProfit(int[] prices,int currentDay,int canBuy,HashMap<String,Integer> memo,int fee)
    {
        if(currentDay >= prices.length)
            return 0;

        String currentKey = currentDay+"_"+canBuy;

        if(memo.containsKey(currentKey))
            return memo.get(currentKey);

        if(canBuy == 1)
        {
            int idle = maxProfit(prices,currentDay+1,canBuy,memo,fee);
            int buy = -prices[currentDay] + maxProfit(prices,currentDay+1,0,memo,fee);
            memo.put(currentKey,Math.max(idle,buy));
        }
        else
        {
            int idle = maxProfit(prices,currentDay+1,canBuy,memo,fee);
            int sell = -fee + prices[currentDay] + maxProfit(prices,currentDay+1,1,memo,fee);
            memo.put(currentKey,Math.max(idle,sell));
        }

        return memo.get(currentKey);
    }
}
