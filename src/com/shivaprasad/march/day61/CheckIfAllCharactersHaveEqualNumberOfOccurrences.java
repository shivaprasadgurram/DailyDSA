package com.shivaprasad.march.day61;

import java.util.HashMap;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {

    public static void main(String[] args) {
        System.out.print(areOccurrencesEqual("abacbc"));
    }
    static boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int firstLetterOccurance = map.get(s.charAt(0));
        for(Integer i:map.values())
        {
            if(i!=firstLetterOccurance)
                return false;
        }
        return true;
    }
}
