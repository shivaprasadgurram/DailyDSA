package com.shivaprasad.january.day23;

//GeeksForGeeks: https://practice.geeksforgeeks.org/problems/tower-of-hanoi-1587115621/1/#
public class TowerOfHanoi {

    public static void main(String[] args) {
        System.out.println(toh(2,1,3,2));

    }

    public static long toh(int N, int from, int to, int aux) {
        long res = 1;
        if(N == 1)
        {
            System.out.println("move disk "+N+" from rod "+from+" to rod "+to);
            return res;
        }
        else
        {

            res +=toh(N-1,from,aux,to);
            System.out.println("move disk "+N+" from rod "+from+" to rod "+to);
            res +=toh(N-1,aux,to,from);
        }
        return res;
        //T.C: O(n)
        //S.C: O(n)
    }
}
