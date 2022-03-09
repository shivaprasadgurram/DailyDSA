package com.shivaprasad.march.day68;

import java.util.HashMap;

public class DistributeCandies {

    public static void main(String[] args) {
        System.out.println(distributeCandies(new int[]{1,1,2,2,3,3}));
    }

    static int distributeCandies(int[] candyType) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(Integer i:candyType)
        {
            map.put(i,1);
        }
        int candiesCanEat = candyType.length/2;
        return map.size()>=candiesCanEat ? candiesCanEat : map.size();
    }
}
