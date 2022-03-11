package com.shivaprasad.march.day70;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }

    static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, List<String>> memo = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            String str = strs[i];

            HashMap<Character, Integer> map = new HashMap<>();

            for(int j=0; j<str.length(); j++){
                char currentValue = str.charAt(j);

                map.put(currentValue, map.getOrDefault(currentValue, 0) + 1);

            }

            if(memo.containsKey(map)){
                List<String> list = memo.get(map);
                list.add(str);
                memo.put(map, list);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(str);
                memo.put(map, list);
            }
        }
        return new ArrayList<>(memo.values());
    }
}
