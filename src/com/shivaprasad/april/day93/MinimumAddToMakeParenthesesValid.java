package com.shivaprasad.april.day93;

public class MinimumAddToMakeParenthesesValid {

    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("((("));
    }

    static int minAddToMakeValid(String s) {
        int openParanthesis = 0;
        int closingParanthesis = 0;

        for(char ch : s.toCharArray()) {

            if(ch == ')') {
                if(openParanthesis > 0)
                    openParanthesis--;
                else
                    closingParanthesis++;
            }
            else
                openParanthesis++;
        }

        return closingParanthesis + openParanthesis;
    }
}
