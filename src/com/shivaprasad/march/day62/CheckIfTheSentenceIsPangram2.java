package com.shivaprasad.march.day62;

public class CheckIfTheSentenceIsPangram2 {

    public static void main(String[] args) {
        System.out.println(checkIfPangram("leetcode"));
    }

    static boolean checkIfPangram(String sentence) {

        int[] arr = new int[26];

        for(int i=0;i<sentence.length();i++)
        {
            arr[sentence.charAt(i) - 'a']++;
        }

        for(int i:arr)
        {
            if(i==0)
                return false;
        }

        return true;

    }
}
