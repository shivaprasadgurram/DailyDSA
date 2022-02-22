package com.shivaprasad.february.day53;

public class DeleteAndEarn {

    public static void main(String[] args) {
        System.out.println(deleteAndEarn(new int[]{2,2,3,3,3,4}));
    }
    static int deleteAndEarn(int[] nums) {

        int[] count = new int[10001];
        for(int val : nums)
            count[val]++;

        count[0] = 0;
        count[1] = count[1] * 1;

        for(int i = 2; i < count.length; i++){
            int choose = count[i] * i + count[i - 2];
            int notChoose = count[i - 1];
            count[i] = Math.max(choose, notChoose);
        }
        return count[count.length - 1];
    }

}
