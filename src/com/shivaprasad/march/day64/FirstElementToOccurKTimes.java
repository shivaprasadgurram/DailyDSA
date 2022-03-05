package com.shivaprasad.march.day64;

import java.util.HashMap;

public class FirstElementToOccurKTimes {

    public static void main(String[] args) {
        System.out.println(firstElementKTime(new int[]{1, 7, 4, 3, 4, 8, 7},
                7,2));
    }

    static int firstElementKTime(int[] a, int n, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:a)
        {
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i) == k)
                return i;
        }
        return -1;
    }
}
