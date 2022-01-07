package com.shivaprasad.january.day7;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));

    }

    public static  int removeDuplicates(int[] nums) {

        int index = 1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i] != nums[i+1])
            {
                nums[index++] = nums[i+1];
            }
        }
        return index;
        //T.C: O(n)
        //S.C: O(1)
    }
}
