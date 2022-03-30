package com.shivaprasad.march.day89;

public class SplitAStringInBalancedStrings {

    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
    }

    static int balancedStringSplit(String s) {
        int res =0;
        int balance = 0;
        for(int i =0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == 'L')
            {
                balance++;
            }
            else if(ch == 'R')
            {
                balance--;
            }

            if(balance == 0) res++;
        }
        return res;
    }
}
