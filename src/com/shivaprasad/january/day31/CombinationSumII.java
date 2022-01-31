package com.shivaprasad.january.day31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    static List<List<Integer>> output;
    public static void main(String[] args) {
        List<List<Integer>> res = combinationSum2(new int[]{10,1,2,7,6,1,5},8);
        System.out.println(res);
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        output = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(candidates,0,target,new ArrayList<>());
        return output;
    }

    private static void findCombinations(int[] candidates, int index, int target, ArrayList<Integer> combines) {

        if(target == 0)
        {
            output.add(new ArrayList<>(combines));
            return;
        }

        for(int i=index;i<candidates.length;i++)
        {
            if(i>index && candidates[i] == candidates[i-1]) continue;
            if(candidates[i] > target) break;
            combines.add(candidates[i]);
            findCombinations(candidates,i+1,target-candidates[i],combines);
            combines.remove(combines.size()-1);
        }
    }


}
