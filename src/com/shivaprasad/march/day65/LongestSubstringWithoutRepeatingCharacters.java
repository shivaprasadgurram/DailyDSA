package com.shivaprasad.march.day65;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    static int lengthOfLongestSubstring(String s) {
        if(s.length() <=1)
            return s.length();
        int max = 0;
        for(int i=0;i<s.length();i++)
        {
            HashMap<Character,Integer> map = new HashMap<>();
            int currentMax = 0;
            for(int j=i;j<s.length();j++)
            {
                if(map.containsKey(s.charAt(j)))
                {
                    break;
                }
                else
                {
                    map.put(s.charAt(j),1);
                    currentMax++;
                }
            }
            max = Math.max(currentMax,max);
            map.clear();
        }
        return max;
    }
}
