package com.shivaprasad.march.day60;

import java.util.HashMap;

public class CountTheNumberOfConsistentStrings {

    public static void main(String[] args) {
        System.out.println(countConsistentStrings("ab",new String[]{"ad","bd","aaab","baa","badab"}));
    }
    static int countConsistentStrings(String allowed, String[] words) {

        int count = words.length;

        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch: allowed.toCharArray())
        {
            map.put(ch,1);
        }

        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words[i].length();j++)
            {
                if(map.get(words[i].charAt(j)) == null)
                {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}
