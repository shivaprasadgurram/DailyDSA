package com.shivaprasad.march.day86;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfAGivenString {
    static List<String> permutations = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println(find_permutation("ABC"));
    }
    static List<String> find_permutation(String S) {
        permute(S,0,S.length()-1);
        //Collections.sort(permutations) -> for lexicographically sorted order
        return permutations;
    }
    static void permute(String str, int l, int r)
    {
        if (l == r)
            permutations.add(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }

    static String swap(String str,int l,int r)
    {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(l, str.charAt(r));
        sb.setCharAt(r, str.charAt(l));
        return sb.toString();
    }
}
