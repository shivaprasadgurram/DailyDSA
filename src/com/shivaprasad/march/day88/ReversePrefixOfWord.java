package com.shivaprasad.march.day88;

public class ReversePrefixOfWord {

    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd",'d'));
    }
    static String reversePrefix(String word, char ch) {
        int lastIndex = 0;
        for(char c : word.toCharArray())
        {
            if(ch == c)
                break;
            else
                lastIndex++;
        }
        if(lastIndex == word.length())
            return word;
        String res = "";
        for(int i=lastIndex;i>=0;i--)
        {
            res += word.charAt(i);
        }
        return res + word.substring(lastIndex+1);
    }
}
