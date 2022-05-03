package com.shivaprasad.may.revision.day123;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] res = twoSum(new int[]{2,7,11,15}, 9);
        for (int i: res) {
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {

            int remainingValue = target - nums[i];

            if(map.containsKey(remainingValue))
                return new int[]{map.get(remainingValue), i};
            else
                map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}
