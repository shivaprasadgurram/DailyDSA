package com.shivaprasad.february.day37;

import java.util.HashMap;

public class MinCostClimbingStairs {

    public static void main(String[] args) {
        System.out.print(minCostClimbingStairs(new int[]{10,15,20}));
    }

    public static int minCostClimbingStairs(int[] cost) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int startFromZeroIndex = minCost(cost,0,map);
        //int startFromOneIndex = minCost(cost,1,new HashMap<Integer,Integer>());
        //Instead of calling minCost for 1st index, you can use value of 1st index from map. like below
        return Math.min(startFromZeroIndex,map.get(1));
    }

    private static int minCost(int[] cost, int currentIndex,HashMap<Integer,Integer> memo) {

        if(currentIndex == cost.length)
            return 0;
        if(currentIndex > cost.length)
            return 1000;

        int currentKey = currentIndex;

        if(memo.containsKey(currentKey))
            return memo.get(currentKey);
        int oneJump = cost[currentIndex] + minCost(cost,currentIndex+1,memo);
        int twoJump = cost[currentIndex] + minCost(cost,currentIndex+2,memo);

        memo.put(currentKey,Math.min(oneJump,twoJump));
        return memo.get(currentKey);
    }
}
