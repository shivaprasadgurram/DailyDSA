package com.shivaprasad.march.day87;

public class ShuffleString {

    public static void main(String[] args) {
        System.out.println(restoreString("codeleet",new int[]{4,5,6,7,0,2,1,3}));
    }
    static String restoreString(String s, int[] indices) {
        char[] output = new char[s.length()];
        for(int i = 0; i < indices.length; i++) {
            output[indices[i]] = s.charAt(i);
        }
        return new String(output);
    }
}
