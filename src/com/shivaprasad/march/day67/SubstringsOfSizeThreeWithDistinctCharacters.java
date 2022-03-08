package com.shivaprasad.march.day67;

import java.util.HashMap;

public class SubstringsOfSizeThreeWithDistinctCharacters {

    public static void main(String[] args) {
        System.out.println(countGoodSubstrings("aababcabc"));
    }
    static int countGoodSubstrings(String s) {
        int count = 0;
        for(int i=0;i<s.length()-2;i++)
        {
            HashMap<Character,Integer> map = new HashMap<>();
            for(int j=i;j<i+3;j++)
            {
                Character ch = s.charAt(j);
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            if(map.size() == 3)
                count++;
            map.clear();
        }
        return count;
    }
}
