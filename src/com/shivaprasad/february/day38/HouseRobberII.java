package com.shivaprasad.february.day38;

import java.util.HashMap;

public class HouseRobberII {

    public static void main(String[] args) {
        System.out.println(rob(new int[]{2,3,2}));
    }

    static int rob(int[] nums) {
        if(nums.length ==1 ) return nums[0];
        return Math.max(maxMoney(nums,0,new HashMap<Integer,Integer>(),nums.length-1),maxMoney(nums,1,new HashMap<Integer,Integer>(),nums.length));
    }
    static int maxMoney(int[] nums, int currentHouse, HashMap<Integer, Integer> memo,int end) {

        if(currentHouse >= end)
            return 0;

        if(memo.containsKey(currentHouse))
            return memo.get(currentHouse);

        int rob = nums[currentHouse] + maxMoney(nums,currentHouse+2,memo,end);
        int notRob = maxMoney(nums,currentHouse+1,memo,end);

        memo.put(currentHouse,Math.max(rob,notRob));
        return memo.get(currentHouse);

        //T.C: O(N)
        //S.C: O(N)
    }
}
