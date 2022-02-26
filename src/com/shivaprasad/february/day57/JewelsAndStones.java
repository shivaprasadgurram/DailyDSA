package com.shivaprasad.february.day57;

import java.util.HashMap;

public class JewelsAndStones {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA","aAAbbbb"));
    }

    static int numJewelsInStones(String jewels, String stones) {

        HashMap<Character,Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0;i<jewels.length();i++)
        {
            Character c = jewels.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int j=0;j<stones.length();j++)
        {
            Character c = stones.charAt(j);
            if(map.containsKey(c))
                count++;
        }
        return count;
    }
}
