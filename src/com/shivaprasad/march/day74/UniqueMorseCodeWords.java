package com.shivaprasad.march.day74;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {

    public static void main(String[] args) {
        System.out.println(uniqueMorseRepresentations(new String[]{"gin","zen","gig","msg"}));
    }
    static int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> set = new HashSet<>();

        for (String word: words) {
            StringBuilder temp = new StringBuilder();
            for (char l: word.toCharArray()) {
                temp.append(morse[l - 'a']);
            }
            set.add(temp.toString());
        }
        return set.size();
    }
}
