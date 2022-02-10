package com.shivaprasad.february.day41;

import java.util.HashMap;

public class PartitionEqualSubsetSum {
    public static void main(String[] args) {
        System.out.println(canPartition(new int[]{1,5,11,5}));
    }
    public static boolean canPartition(int[] nums) {
        int total = 0;
        for(int num : nums)
        {
            total += num;
        }
        if(total%2!=0)
            return false;
        return isPossible(nums,0,total/2,new HashMap<String,Boolean>());
    }

    public static boolean isPossible(int[] nums,int currentIndex,int targetSum,HashMap<String,Boolean> memo)
    {
        if(targetSum == 0)
            return true;

        if(currentIndex >= nums.length)
            return false;

        String currentKey = currentIndex+"_"+targetSum;

        if(memo.containsKey(currentKey))
            return memo.get(currentKey);

        boolean consider = false;

        if(nums[currentIndex] <= targetSum)
            consider = isPossible(nums,currentIndex+1,targetSum - nums[currentIndex],memo);

        if(consider)
        {
            memo.put(currentKey,true);
            return true;
        }
        boolean notConsider = isPossible(nums,currentIndex+1,targetSum,memo);
        memo.put(currentKey, consider || notConsider);
        return memo.get(currentKey);
    }
}
