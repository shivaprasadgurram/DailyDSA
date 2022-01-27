package com.shivaprasad.january.day27;

public class DecodeString {
    static int i = 0;
    public static void main(String[] args) {
        System.out.println(decodeString("3[a2[c]]"));
    }

    public static String decodeString(String s) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        while (i < s.length()) {
            char c = s.charAt(i);
            i++;
            if (Character.isLetter(c)) sb.append(c);
            else if (Character.isDigit(c)) count = count * 10 + Character.getNumericValue(c);
            else if (c == ']') break;
            else if (c == '[') {
                //sub problem
                String repeat = decodeString(s);
                while (count > 0) {
                    sb.append(repeat);
                    count--;
                }
            }
        }
        return sb.toString();
        //Took this from Leetcode discussion forum since I didn't understand it properly.
    }
}
