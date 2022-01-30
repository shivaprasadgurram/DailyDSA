package com.shivaprasad.january.day30;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public static void main(String[] args) {
        List<List<Integer>> res = combine(4,2);
        System.out.println(res);
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> output = new ArrayList<>();
        if(k == 0) return output;
        helper(output,new ArrayList<Integer>(),n,k,1);
        return output;
    }

    private static void helper(List<List<Integer>> output, ArrayList<Integer> combines, int n, int k, int index) {
        if(combines.size() == k)
        {
            output.add(new ArrayList<>(combines));
            return;
        }

        for(int i=index;i<=n;i++)
        {
            combines.add(i);
            helper(output,combines,n,k,i+1);
            combines.remove(combines.size()-1);
        }
    }

}
