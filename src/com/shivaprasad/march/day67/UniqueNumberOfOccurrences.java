package com.shivaprasad.march.day67;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurrences {

    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1,2,2,1,1,3}));
    }

    static boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i:arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        HashSet<Integer> set = new HashSet<>(map.values());

        if(set.size()==map.size())return true;

        return false;

    }
}
