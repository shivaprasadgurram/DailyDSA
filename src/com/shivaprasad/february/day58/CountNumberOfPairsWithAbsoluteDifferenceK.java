package com.shivaprasad.february.day58;

import java.util.HashMap;

public class CountNumberOfPairsWithAbsoluteDifferenceK {

    public static void main(String[] args) {
        System.out.println(countKDifference(new int[]{3,2,1,5,4},2));
    }

    static int countKDifference(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            int currentVal = nums[i];
            if(map.containsKey(currentVal - k))
                count += map.get(currentVal-k);
            if(map.containsKey(currentVal + k))
                count += map.get(currentVal+k);

            map.put(currentVal,map.getOrDefault(currentVal,0)+1);
        }
        return count;
    }
}
