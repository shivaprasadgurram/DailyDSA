package com.shivaprasad.january.day22;

public class PowerOfTwo {

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }

    public static boolean isPowerOfTwo(int n) {

        if(n == 1)
            return true;

        if(n<=0 || n%2!=0)
            return false;

        return isPowerOfTwo(n/2);

        //T.C: log2n
        //S.C: log2n
    }
}
