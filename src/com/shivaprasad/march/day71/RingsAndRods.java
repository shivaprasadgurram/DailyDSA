package com.shivaprasad.march.day71;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RingsAndRods {

    public static void main(String[] args) {
        System.out.println(countPoints("B0B6G0R6R0R6G9"));
    }
    static int countPoints(String rings) {
        int n = rings.length();
        Map<Integer, Set<Character>> map = new HashMap<>();
        for(int i = 0; i < 10; i ++) {
            map.put(i, new HashSet<>());
        }
        for(int i = 0; i < n; i += 2) {
            char colour = rings.charAt(i);
            int rod = (int)(rings.charAt(i + 1) - '0');
            map.get(rod).add(colour);
        }
        int count = 0;
        for(int i = 0; i < 10; i ++) {
            Set<Character> set = map.get(i);
            if(set.contains('R') && set.contains('G') && set.contains('B')) {
                count ++;
            }
        }
        return count;
    }
}
