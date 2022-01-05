package com.shivaprasad.january.day5;

//This problem focus on only returning K(elements) after removing duplicates
//Don't worry about main method for loop, It will print first K elements as expected
//but last nums.length - K won't be as expected in leetcode problem i.e, '_';
public class RemoveElement {

    public static void main(String[] args) {

        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums,2));

        for(int i: nums)
        {
            System.out.print(i +"  ");
        }
    }

    public static int removeElement(int[] nums, int val) {

        int index = 0;
        for(int k=0;k<nums.length;k++)
        {
            if(nums[k] != val)
            {
                nums[index++] = nums[k];
            }
        }
        return index;
        //T.C: O(n)
        //S.C: O(1)
    }
}
