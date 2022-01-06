package com.shivaprasad.january.day6;

public class MoveZeroes {

    public static void main(String[] args) {

        int[] nums = {0};
        moveZeroes(nums);

        for(int i : nums)
        {
            System.out.print(i +"   ");
        }

    }

    public static  void moveZeroes(int[] nums) {

        int index = 0;
        for(int i=0;i< nums.length;i++)
        {
            if(nums[i] != 0)
            {
                nums[index++] = nums[i];
            }
        }
        for(int i=index;i<nums.length;i++)
        {
            nums[index++] = 0;
        }
        //T.C: O(n)
        //S.C: O(1)
    }
}
