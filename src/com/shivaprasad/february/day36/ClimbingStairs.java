package com.shivaprasad.february.day36;

import java.util.HashMap;

public class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }

    public static int climbStairs(int n) {
        return totalWays(0,n,new HashMap<Integer,Integer>());
    }

    private static int totalWays(int currentStair, int targetStair,HashMap<Integer,Integer> memo) {

        if(currentStair == targetStair)
            return 1;
        if(currentStair>targetStair)
            return 0;

        if(memo.containsKey(currentStair))
        {
            return memo.get(currentStair);
        }
        int oneStep = totalWays(currentStair+1,targetStair,memo);
        int twoStep = totalWays(currentStair+2,targetStair,memo);

        memo.put(currentStair,oneStep+twoStep);

        return memo.get(currentStair);

        //T.C: O(N)
        //S.C: O(N) + O(N) = O(N)
    }
}
