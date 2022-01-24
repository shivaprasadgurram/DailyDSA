package com.shivaprasad.january.day24;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'s','h','i','v','a'};
        reverseString(s);

        for(char c: s)
        {
            System.out.print(c+"  ");
        }
    }

    public static void reverseString(char[] s) {
        getReversedString(s,0,s.length-1);
    }

    public static  void getReversedString(char[] s,int start,int end)
    {
        if(start >= end)
            return;

        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        getReversedString(s,++start,--end);

        //T.C: O(n)
        //S.C: O(1) but O(n) for recursive call stack
    }
}
