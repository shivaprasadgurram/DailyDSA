package com.shivaprasad.january.day29;

public class KthSymbolInGrammar {

    public static void main(String[] args) {
        System.out.println(kthGrammar(2,2));
    }

    public static int kthGrammar(int n, int k) {
        return solve(n,k);
    }

    public static int solve(int n,int k)
    {
        if(n == 1 || k == 1)
            return 0;
        int mid = (int) Math.pow(2,n-1)/2;
        if(k<=mid)
            return solve(n-1,k);
        else
            return 1 - solve(n-1,k-mid);
    }
}
