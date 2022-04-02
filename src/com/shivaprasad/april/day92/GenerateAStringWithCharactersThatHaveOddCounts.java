package com.shivaprasad.april.day92;

public class GenerateAStringWithCharactersThatHaveOddCounts {

    public static void main(String[] args) {
        System.out.println(generateTheString(4));
    }
    static String generateTheString(int n) {
        if(n == 1)
            return "x";

        StringBuilder sb = new StringBuilder();

        for(int i=1;i<n;i++) {
            sb.append("x");
        }

        if(n%2 == 0)
            sb.append("y");
        else
            sb.append("x");
        return sb.toString();
    }
}
