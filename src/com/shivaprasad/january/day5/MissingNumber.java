package com.shivaprasad.january.day5;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }

    public static  int missingNumber(int[] nums) {
        int n = nums.length;
        int total = (n * (n+1))/2;
        //Maths formula to sum the first N numbers
        for(int i=0;i<n;i++)
        {
            total -= nums[i];
        }
        return total;
        //T.C: O(n)
        //S.C: O(1)
    }
}
