package com.shivaprasad.may.revision.day129;

public class MaximumSubarray {

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    public static int maxSubArray(int[] nums) {
        int ans = nums[0];
        int curr = nums[0];
        for(int i=1;i<nums.length;i++){
            curr = Math.max(nums[i],curr+nums[i]);
            ans = Math.max(ans,curr);
        }
        return ans;
    }
}
