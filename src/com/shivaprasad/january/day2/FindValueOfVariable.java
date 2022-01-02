package com.shivaprasad.january.day2;

//Leetcode #2011

public class FindValueOfVariable {

    public static void main(String[] args) {

        String[] operations = {"X++","++X","--X","X--"};
        System.out.println(finalValueAfterOperations(operations));

    }

    public static  int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for(String s : operations)
        {
            if(s.charAt(1) == '+')
                ++X;
            else
                --X;
        }
        return X;
    }
}
