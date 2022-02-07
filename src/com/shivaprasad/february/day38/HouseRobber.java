package com.shivaprasad.february.day38;

import java.util.HashMap;

public class HouseRobber {
    public static void main(String[] args) {
        System.out.println(rob(new int[]{1,2,3,1}));
    }

    static int rob(int[] nums) {
        return maxMoney(nums,0,new HashMap<Integer,Integer>());
    }

    static int maxMoney(int[] nums, int currentHouse, HashMap<Integer, Integer> memo) {

        if(currentHouse >= nums.length)
            return 0;

        if(memo.containsKey(currentHouse))
            return memo.get(currentHouse);

        int rob = nums[currentHouse] + maxMoney(nums,currentHouse+2,memo);
        int notRob = maxMoney(nums,currentHouse+1,memo);

        memo.put(currentHouse,Math.max(rob,notRob));
        return memo.get(currentHouse);

        //T.C: O(N)
        //S.C: O(N)
    }
}
