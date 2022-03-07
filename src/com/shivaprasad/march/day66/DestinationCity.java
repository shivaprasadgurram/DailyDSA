package com.shivaprasad.march.day66;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DestinationCity {

    public static void main(String[] args) {

        List<List<String>> list = Arrays.asList(Arrays.asList("London","New York"),
                Arrays.asList("New York","Lima"),
                Arrays.asList("Lima","Sao Paulo"));

        System.out.println(destCity(list));
    }

    static String destCity(List<List<String>> paths) {
        if(paths == null || paths.size() == 0) return "";
        HashMap<String,String> map = new HashMap<>();
        for(List<String> path : paths)
        {
            map.put(path.get(0),path.get(1));
        }
        for(String destination : map.values())
        {
            if(!map.containsKey(destination))
                return destination;
        }
        return "";
    }
}
