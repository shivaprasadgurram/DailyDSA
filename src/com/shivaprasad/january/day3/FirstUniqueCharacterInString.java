package com.shivaprasad.january.day3;

public class FirstUniqueCharacterInString {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }

    public static int firstUniqChar(String s) {

        int[] frequency = new int[26];

        for(char c : s.toCharArray())
        {
            frequency[c - 'a']++;
        }

        for(int i=0;i<s.length();i++)
        {
            if(frequency[s.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;

        //T.C : O(n)
        //S.C : O(n)
    }
}
