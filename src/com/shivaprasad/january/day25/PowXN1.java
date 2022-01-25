package com.shivaprasad.january.day25;

public class PowXN1 {

    public static void main(String[] args) {
        System.out.println(myPow(2,5));
    }

    public static double myPow(double x, int n) {

        double res = 1.0;
        long nD = n;
        if(nD < 0) nD = -1 * nD;

        while(nD > 0)
        {
            if(nD % 2 == 1)
            {
                res = res * x;
                nD = nD -1;
            }
            else{
                x  = x*x;
                nD = nD/2;
            }
        }

       if ( n < 0) res = 1.0/res;
       return res;

         //T.C: logN;
        //S.C: O(1)
    }
}
