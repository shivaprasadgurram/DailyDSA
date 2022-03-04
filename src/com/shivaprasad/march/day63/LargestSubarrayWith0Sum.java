package com.shivaprasad.march.day63;

import java.util.HashMap;

public class LargestSubarrayWith0Sum {

    public static void main(String[] args) {
        System.out.println(maxLen(new int[]{15,-2,2,-8,1,7,10,23},8));
    }

    static int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int prefixSum = 0;
        int res = 0;
        map.put(prefixSum,-1);
        for(int i=0;i<n;i++)
        {
            int currentValue = arr[i];
            prefixSum += currentValue;
            if(map.containsKey(prefixSum))
            {
                int temp = i - map.get(prefixSum);
                res = Math.max(res,temp);
            }
            else
            {
                map.put(prefixSum,i);
            }
        }
        return res;
    }
}
