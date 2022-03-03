package com.shivaprasad.march.day62;

import java.util.HashMap;

public class KthDistinctStringInAnArray {

    public static void main(String[] args) {
        System.out.println(kthDistinct(new String[]{"d","b","c","b","c","a"},2));
    }

    static String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String s : arr)
        {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int tracker = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(tracker == k-1 && map.get(arr[i]) == 1)
                return arr[i];
            if(map.get(arr[i]) == 1) tracker++;
        }
        return "";
    }
}
