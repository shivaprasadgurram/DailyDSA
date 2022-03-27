package com.shivaprasad.march.day86;

public class ReverseWordsInAGivenString {

    public static void main(String[] args) {
        System.out.println(reverseWords("i.like.this.program.very.much"));
    }
    static String reverseWords(String S)
    {
        StringBuffer sb = new StringBuffer();
        String words[] = S.split("\\.");

        for(int i=words.length-1;i>=0;i--)
        {
            sb.append(words[i]);
            sb.append(".");
        }
        return sb.substring(0,sb.length()-1).toString();
    }
}
