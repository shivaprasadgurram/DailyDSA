package com.shivaprasad.january.day4;

//GeeksForGeeks: https://practice.geeksforgeeks.org/problems/binary-array-sorting-1587115620/1
public class BinaryArraySorting {

    public static void main(String[] args) {

        int[] A = {1,0,1,1,1,1,0,0,1,0};
        binSort(A,A.length);
        for(int i: A)
        {
            System.out.print(i +"  ");
        }
    }

    static void binSort(int A[], int N)
    {

        int ones = 0,j =0;

        for(int i=0;i<N;i++)
        {
            if(A[i] == 1)
                ones++;
            else
                A[j++] = 0;
        }

        for(int i=ones;i<N;i++)
        {
            A[i] = 1;
        }

        //T.C: O(n)
        //S.C: O(1)
    }
}
