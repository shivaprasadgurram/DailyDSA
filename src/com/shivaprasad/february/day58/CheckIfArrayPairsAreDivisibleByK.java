package com.shivaprasad.february.day58;

import java.util.HashMap;

public class CheckIfArrayPairsAreDivisibleByK {

    public static void main(String[] args) {
        System.out.println(canArrange(new int[]{1,2,3,4,5,10,6,7,8,9},5));
    }

    static boolean canArrange(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int rem = ((arr[i] % k) + k) % k;
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        for(Integer key: map.keySet())
        {
            if(key == 0){
                if(map.get(key)%2 != 0){
                    return false;
                }
            }
            else if(map.containsKey(k - key) == false){
                return false;
            }
            else if(map.get(key).equals(map.get(k - key)) == false){
                return false;
            }
        }
        return true;
    }
}
