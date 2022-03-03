package com.shivaprasad.march.day62;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class KthDistinctStringInAnArray2 {

    public static void main(String[] args) {
        System.out.println(kthDistinct(new String[]{"aaa","aa","a"},1));
    }

    static String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map = new LinkedHashMap<>();
        for(String s : arr)
        {
            map.put(s,map.getOrDefault(s,0)+1);
        }

        for(String s: map.keySet())
        {
            if(map.get(s) == 1)
                k--;
            if(k==0) return s;
        }
        return "";
    }
}
