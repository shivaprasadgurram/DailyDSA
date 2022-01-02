package com.shivaprasad.january.day2;

import java.util.ArrayList;
import java.util.List;

//HackerRank: https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem

public class LeftRotate1 {

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        int d = 2;
        List<Integer> res = rotLeft(a,d);
        System.out.println(res);
    }
    public static List<Integer> rotLeft(List<Integer> a, int d) {

        for(int i=0;i<d;i++)
        {
            a.add(a.remove(0));
        }
        return a;
    }

    //T.C: O(n)
    //S.C: O(1)
}
