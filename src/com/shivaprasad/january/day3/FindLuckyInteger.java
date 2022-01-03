package com.shivaprasad.january.day3;

public class FindLuckyInteger {
    public static void main(String[] args) {

        int[] arr = {1,2,2,3,3,3};
        //Try this: [14,14,19,11,6,4,16,17,3,7,7,5,15,12,3,20,1,13,5,20,1,12,10,2]
        System.out.println(findLucky(arr));
    }

    public static int findLucky(int[] arr) {

        int[] res = new int[501];

        for(int i: arr)
        {
            res[i]++;
        }

        for(int i=res.length-1;i>0;i--)
        {
            if(i == res[i])
                return i;
        }
        return -1;

        //T.C : O(n)
        //S.C : O(n)
    }
}
