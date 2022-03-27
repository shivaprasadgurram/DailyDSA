package com.shivaprasad.march.day86;

public class RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println(removeDups("shivaprasad"));
    }
    static String removeDups(String S) {

        int[] alphabets = new int[26];
        String res = "";
        for(char c : S.toCharArray())
        {
            alphabets[c - 'a']++;
        }
        for(int i=0;i<S.length();i++)
        {
            int value = S.charAt(i) - 'a';
            if(alphabets[value] > 0)
            {
                res += S.charAt(i);
                alphabets[value] = 0;
            }
        }
        return res;
    }
}
