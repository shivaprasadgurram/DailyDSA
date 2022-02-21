package com.shivaprasad.february.day52;

import java.util.HashMap;

public class UniqueBST {
    public static void main(String[] args) {
        System.out.println(numTrees(3));
    }
    static int numTrees(int n) {
        return uniqueBSTs(n,new HashMap<Integer,Integer>());
    }

    static int uniqueBSTs(int n,HashMap<Integer,Integer> memo)
    {
        if(n<=1)
            return 1;

        if(memo.containsKey(n))
            return memo.get(n);

        int w = 0;

        for(int i=0;i<n;i++)
        {
            w += uniqueBSTs(i,memo) * uniqueBSTs(n -i-1,memo);
        }

        memo.put(n,w);
        return memo.get(n);
    }

}
