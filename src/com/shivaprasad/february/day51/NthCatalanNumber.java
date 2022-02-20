package com.shivaprasad.february.day51;

import java.math.BigInteger;
import java.util.HashMap;

public class NthCatalanNumber {

    public static void main(String[] args) {
        System.out.println(findCatalan(5));
    }

    public static BigInteger findCatalan(int n)
    {
        return nthCatalan(n,new HashMap<Integer,BigInteger>());
    }

    static BigInteger nthCatalan(int n, HashMap<Integer,BigInteger> memo)
    {
        if(n<=1)
            return BigInteger.ONE;

        if(memo.containsKey(n))
            return memo.get(n);

        BigInteger w = BigInteger.ZERO;

        for(int i=0;i<n;i++)
        {
            w = w.add(nthCatalan(i,memo).multiply(nthCatalan(n -i-1,memo)));
        }

        memo.put(n,w);
        return memo.get(n);
    }
}
