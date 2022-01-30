package com.shivaprasad.january.day30;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {
        List<List<Integer>> res = combinationSum(new int[]{2,3,5},8);
        System.out.println(res);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> output = new ArrayList<>();
        combinationsGenerator(candidates,0,target,new ArrayList<Integer>(),output);
        return output;
    }

    private static void combinationsGenerator(int[] nums, int currentIndex, int target, ArrayList<Integer> currentSet, List<List<Integer>> output) {

        if(target == 0)
        {
            output.add(new ArrayList<>(currentSet));
            return;
        }
        if(currentIndex>=nums.length)
            return;

        int currentVal = nums[currentIndex];

        if(target>= currentVal)
        {
            currentSet.add(currentVal);
            combinationsGenerator(nums,currentIndex,target-currentVal,currentSet,output);
            currentSet.remove(currentSet.size()-1);
        }

        combinationsGenerator(nums,currentIndex+1,target,currentSet,output);
        return;
    }

}
