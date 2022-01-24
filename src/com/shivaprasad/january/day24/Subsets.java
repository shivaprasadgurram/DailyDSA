package com.shivaprasad.january.day24;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] nums={1,2,3};

        List<List<Integer>> res = subsets(nums);
        System.out.println(res);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> powerSet = new ArrayList<>();
        generateSubsets(nums,0,new ArrayList<>(),powerSet);
        return powerSet;
    }

    private static void generateSubsets(int[] nums, int currentIndex, List<Integer> currentSubset, List<List<Integer>> powerSet) {

        if(currentIndex>=nums.length)
        {
            powerSet.add(new ArrayList<>(currentSubset));
            return;
        }

        int currVal = nums[currentIndex];
        currentSubset.add(currVal);
        generateSubsets(nums,currentIndex+1,currentSubset,powerSet);

        currentSubset.remove(currentSubset.size()-1);
        generateSubsets(nums,currentIndex+1,currentSubset,powerSet);
        return;

        //T.C: O(2^n)
        //S.C: O(2^n)
    }


}
