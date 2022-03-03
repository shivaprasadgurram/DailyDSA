package com.shivaprasad.march.day62;

import java.util.HashMap;

public class CheckIfTheSentenceIsPangram {

    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }

    static boolean checkIfPangram(String sentence) {

        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch:sentence.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        return map.size() == 26;

    }
}
