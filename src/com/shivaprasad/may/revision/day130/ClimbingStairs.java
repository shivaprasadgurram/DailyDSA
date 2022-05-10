package com.shivaprasad.may.revision.day130;

import java.util.HashMap;

public class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }

   static public int climbStairs(int n) {
        return totalDistinctWays(0,n,new HashMap<Integer,Integer>());
    }

    static int totalDistinctWays(int currentStair,int targetStair,HashMap<Integer,Integer> memo)
    {
        if(currentStair == targetStair)
            return 1;
        if(currentStair > targetStair)
            return 0;
        if(memo.containsKey(currentStair))
            return memo.get(currentStair);
        int oneStep  = totalDistinctWays(currentStair+1,targetStair,memo);
        int twoSteps = totalDistinctWays(currentStair+2,targetStair,memo);
        memo.put(currentStair,oneStep + twoSteps);
        return oneStep + twoSteps;
    }
}
