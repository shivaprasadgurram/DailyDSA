package com.shivaprasad.march.day73;

import java.util.HashMap;

public class RansomNote {

    public static void main(String[] args) {
        System.out.println(canConstruct("aa","ab"));
    }
    static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(Character ch:magazine.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Character c:ransomNote.toCharArray())
        {
            if(map.containsKey(c)  && map.get(c) > 0)
            {
                map.put(c,map.get(c) - 1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}
