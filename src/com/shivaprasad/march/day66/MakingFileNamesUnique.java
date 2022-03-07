package com.shivaprasad.march.day66;

import java.util.HashMap;
import java.util.Map;

public class MakingFileNamesUnique {
    public static void main(String[] args) {
        String[] res = getFolderNames(new String[]{"onepiece","onepiece(1)","onepiece(2)","onepiece(3)","onepiece"});
        for(String s:res)
        {
            System.out.print(s+"  ");
        }
    }
    static String[] getFolderNames(String[] names) {
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<names.length; i++) {
            String current = names[i];
            while (map.containsKey(current)) {
                int count = map.get(names[i]);
                count += 1;
                map.put(names[i], count);
                StringBuilder sb = new StringBuilder();
                sb.append(names[i]);
                sb.append("(");
                sb.append(count);
                sb.append(")");
                current = sb.toString();
            }
            map.put(current, 0);
            names[i] = current;
        }
        return names;
    }
}
