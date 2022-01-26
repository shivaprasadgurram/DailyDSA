package com.shivaprasad.january.day26;

public class DetectCapital {

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("gERMENY"));
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("leetcode"));
        System.out.println(detectCapitalUse("Google"));
        System.out.println(detectCapitalUse("FlaG"));
    }

    public static boolean detectCapitalUse(String word) {

        int capitals = 0;

        for(char c: word.toCharArray())
        {
            if(Character.isUpperCase(c))
            {
                capitals++;
            }
        }

        if(capitals == word.length() || capitals == 0) return true;
        return capitals == 1 && Character.isUpperCase(word.charAt(0));
    }
}
