package com.shivaprasad.march.day61;

import java.util.HashMap;

public class SumOfUniqueElements {

    public static void main(String[] args) {
        System.out.println(sumOfUnique(new int[]{1,2,3,2}));
    }

    static int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int sum = 0;
        for(int j:nums)
        {
            if(map.get(j) == 1)
                sum+=j;
        }
        return sum;
    }
}
