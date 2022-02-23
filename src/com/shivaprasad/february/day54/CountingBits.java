package com.shivaprasad.february.day54;

public class CountingBits {

    public static void main(String[] args) {
        int[] result = countBits(9);
        for(int i: result)
            System.out.print(i+" ");
    }
    static int[] countBits(int n) {

        int[] ans = new int[n+1];
        ans[0] = 0;

        for(int i=1;i<=n;i++)
        {
            ans[i] = ans[i/2] + i%2;
        }

        return ans;

    }
}
