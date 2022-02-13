package com.shivaprasad.february.day44;

public class RodCutting {

    public static void main(String[] args) {
        int[] price = {1, 5, 8, 9, 10, 17, 17, 20};
        System.out.println(cutRod(price,8));
    }

    public static int cutRod(int price[], int n) {
        int[][] arr = new int[price.length][n+1];
        return maxValue(price, 0, n, arr);
    }

    public static int maxValue(int[] price, int currentIndex, int n, int[][] memo)
    {
        if(n==0){
            return 0;
        }
        if(currentIndex >= price.length){
            return 0;
        }

        if(memo[currentIndex][n]!=0){
            return memo[currentIndex][n];
        }

        int consider = 0;
        if(currentIndex + 1 <= n){
            consider = price[currentIndex] + maxValue(price, currentIndex, n - (currentIndex + 1), memo);
        }
        else
            return 0;
        int notConsider = maxValue(price, currentIndex + 1, n, memo);

        memo[currentIndex][n] = Math.max(consider, notConsider);
        return memo[currentIndex][n];

    }
}
