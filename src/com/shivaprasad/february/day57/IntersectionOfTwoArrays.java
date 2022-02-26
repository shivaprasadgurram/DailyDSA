package com.shivaprasad.february.day57;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        int[] res = intersection(nums1,nums2);
        for(int i: res)
            System.out.print(i+" ");
    }

    static int[] intersection(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums1)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num : nums2)
        {
            if(map.containsKey(num))
            {
                list.add(num);
                map.remove(num);
            }
        }
        //Below code is based on platform
        int[] res = new int[list.size()];
        int index = 0;
        for(Integer i: list)
        {
            res[index++] = i;
        }
        return res;
    }
}
