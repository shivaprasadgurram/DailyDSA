package com.shivaprasad.february.day57;

import java.util.HashMap;

public class FrequenciesOfLimitedRangeArrayElements {

    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 3, 5};
        frequencyCount(arr,arr.length,5);
        for(int a : arr)
            System.out.println(a);
    }
    public static void frequencyCount(int arr[], int N, int P)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i=1;i<=N;i++)
        {
            if(map.containsKey(i))
                arr[i-1] = map.get(i);
            else
                arr[i-1] = 0;
        }
    }
}
