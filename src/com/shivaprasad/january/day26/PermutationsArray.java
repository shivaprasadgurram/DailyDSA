package com.shivaprasad.january.day26;

import java.util.ArrayList;
import java.util.List;

public class PermutationsArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> res = permute(nums);

        for(List<Integer> r: res)
        {
            System.out.println(r);
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        recurPermute(nums,ds,ans,freq);
        return ans;
    }

    private static void recurPermute(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] freq) {
        if(ds.size() == nums.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(!freq[i])
            {
                freq[i] = true;
                ds.add(nums[i]);
                recurPermute(nums,ds,ans,freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
        //T.C: O(n! * n)
        //S.C: O(n) + O(n)
    }
}
