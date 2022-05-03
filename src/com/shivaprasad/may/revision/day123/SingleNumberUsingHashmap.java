package com.shivaprasad.may.revision.day123;

import java.util.HashMap;

public class SingleNumberUsingHashmap {

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i], map.getOrDefault(nums[i] , 0)+1);
        }
        for(Integer i: map.keySet()) {

            if(map.get(i) == 1)
                return i;
        }
        return -1;
    }
}
