package com.shivaprasad.february.day59;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class CommonElements {
    public static void main(String[] args) {
        //Define two ArrayLists and call common_elements
    }
    public static ArrayList<Integer> common_element(ArrayList<Integer> v1, ArrayList<Integer> v2)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int val:v1)
        {
            map.put(val,map.getOrDefault(val,0)+1);
        }
        for(int val:v2)
        {
            if(map.containsKey(val) && map.get(val)>0)
            {
                list.add(val);
                map.put(val,map.get(val)-1);
            }
        }
        Collections.sort(list);
        return list;
    }
}
