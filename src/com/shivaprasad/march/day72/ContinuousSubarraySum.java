package com.shivaprasad.march.day72;

import java.util.HashMap;

public class ContinuousSubarraySum {

    public static void main(String[] args) {
        System.out.println(checkSubarraySum(new int[]{23,2,4,6,7},6));
    }

    static boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0, sum = 0; i < nums.length; i++) {
            sum += nums[i];
            int remainder = sum % k;
            if (i - map.getOrDefault(remainder, i) > 1)
                return true;
            map.putIfAbsent(remainder, i);
        }
        return false;
    }
}
