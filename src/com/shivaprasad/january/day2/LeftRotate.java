package com.shivaprasad.january.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//HackerRank: https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem
public class LeftRotate {

    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(1,2,3,4,5);
        int d = 2;
        List<Integer> res = rotLeft(a,d);
        System.out.println(res);
    }

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        int[] res = new int[a.size()];
        for(int i=0;i<a.size();i++)
        {
            if(i >= d)
            {
                res[i - d] = a.get(i);
            }
            else
            {
                res[i + (a.size() - d)] =  a.get(i);
            }
        }

        List<Integer> output = new ArrayList<>(res.length);

        for(int j=0;j<res.length;j++)
        {
            output.add(res[j]);
        }
        return output;
    }

    //T.C = O(n)
    //S.C = O(n)
}
