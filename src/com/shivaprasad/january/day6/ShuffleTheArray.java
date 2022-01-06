package com.shivaprasad.january.day6;


public class ShuffleTheArray {

    public static void main(String[] args) {

        int[] input = {2,5,1,3,4,7};
        int[] output = shuffle(input,3);

        for(int i : output)
        {
            System.out.print(i + "  ");
        }
    }

    public static int[] shuffle(int[] nums, int n) {

        int[] arr = new int[2 * n];

        for(int i=0;i<n;i++)
        {
            arr[2 * i] = nums[i];
            arr[2 * i + 1] = nums[n+i];
        }
        return arr;

        //T.C: O(n)
        //S.C: O(n)
    }
}
