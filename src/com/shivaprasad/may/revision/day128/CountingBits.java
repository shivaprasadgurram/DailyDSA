package com.shivaprasad.may.revision.day128;

public class CountingBits {

    public static void main(String[] args) {
    //call countBits(int n);
    }

    public int[] countBits(int n) {
        int[] res = new int[n+1];
        res[0] = 0;
        for(int i=1;i<=n;i++)
        {
            res[i] = res[i/2] + i%2;
        }
        return res;
    }
}
