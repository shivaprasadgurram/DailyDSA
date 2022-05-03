package com.shivaprasad.may.revision.day123;

public class SingleNumberUsingXOR {

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for(int i : nums) {
            result = result ^ i;
        }
        return result;
    }
}
