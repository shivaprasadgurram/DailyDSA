package com.shivaprasad.april.day92;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {

    public static void main(String[] args) {
        System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
    }

    static List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();
        int[] charsIndex = new int[26];

        for(int i=0;i<s.length();i++) {
            charsIndex[s.charAt(i) - 'a'] = i;
        }

        int i = 0;
        while(i < s.length()) {
            char start = s.charAt(i);
            int terminalIndex = charsIndex[start - 'a'];
            System.out.println(start + "  -> " +terminalIndex);

            for(int j=i+1;j<=terminalIndex;j++) {
                terminalIndex = Math.max(terminalIndex,charsIndex[s.charAt(j) - 'a']);
            }
            res.add(terminalIndex - i + 1);
            i = terminalIndex + 1;
        }

        return res;
    }
}
