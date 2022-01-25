package com.shivaprasad.january.day25;

//Need to revisit
public class PowXN {

    public static void main(String[] args) {

        System.out.println(myPow(2.00000,-2147483648));
    }

    public static double myPow(double x, int n) {

        if (n == 0) { return 1; }

        double res = myPow(x, n / 2);
        res = res * res;
        if (n % 2 == 0) {
            return res;
        } else if (n > 0) {
            return x * res;
        } else {
            return res / x;
        }

        //T.C: logN
        //S.C: logN
    }
}
