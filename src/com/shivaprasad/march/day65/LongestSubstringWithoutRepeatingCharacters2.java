package com.shivaprasad.march.day65;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters2 {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    static int lengthOfLongestSubstring(String s) {

        int max = 0;
        int left = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            Character current = s.charAt(i);
            if(map.containsKey(current) && map.get(current) >= left)
                left = map.get(current) + 1;

            int diff = i - left + 1;
            map.put(current,i);
            max = Math.max(diff,max);
        }
        return max;
    }
}
