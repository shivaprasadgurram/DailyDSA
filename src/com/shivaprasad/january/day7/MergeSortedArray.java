package com.shivaprasad.january.day7;

//m and n are representing the number of elements in each array
public class MergeSortedArray {
    public static void main(String[] args) {

        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        merge(nums1, 3,nums2, 3);

        for(int i : nums1)
        {
            System.out.println(i +"  ");
        }

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int pointer1 = m-1, pointer2 = n-1,index = m+n-1;

        while(pointer2 >= 0)
        {
            if(pointer1 >= 0 && nums1[pointer1] > nums2[pointer2])
            {
                nums1[index--] = nums1[pointer1--];
            }
            else
            {
                nums1[index--] = nums2[pointer2--];
            }
        }
        //T.C: O(m+n)
        //S.C: O(1)
    }
}
