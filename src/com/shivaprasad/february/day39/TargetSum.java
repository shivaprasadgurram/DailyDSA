package com.shivaprasad.february.day39;

import java.util.HashMap;

public class TargetSum {

    public static void main(String[] args) {
        System.out.println(findTargetSumWays(new int[]{2,1,3,1},3));
    }

    public static int findTargetSumWays(int[] nums, int target) {
        return totalWays(nums,target,0,new HashMap<String,Integer>());
    }

    private static int totalWays(int[] nums, int target, int currentIndex, HashMap<String, Integer> memo) {

        if(currentIndex >= nums.length && target!=0)
            return 0;

        if(currentIndex >= nums.length && target ==0)
            return 1;

        String key = +currentIndex+"_"+target;

        if(memo.containsKey(key))
            return memo.get(key);

        int positiveChoice = totalWays(nums,target - nums[currentIndex],currentIndex+1,memo);
        int negativeChoice = totalWays(nums,target+nums[currentIndex],currentIndex+1,memo);

        memo.put(key,positiveChoice+negativeChoice);
        return memo.get(key);
    }

}
