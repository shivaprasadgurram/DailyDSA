package com.shivaprasad.january.day1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int[] output = twoSum(nums,9);

        if(output!=null)
        {
            for(int i : output)
            {
                System.out.println(i);
            }
        }
        else
        {
            System.out.println("No match found!");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            int remaining = target - nums[i];
            if(map.containsKey(remaining))
            {
                return new int[]{i,map.get(remaining)};
            }
            else
            {
                map.put(nums[i],i);
            }
        }

        return null;

    }
}
