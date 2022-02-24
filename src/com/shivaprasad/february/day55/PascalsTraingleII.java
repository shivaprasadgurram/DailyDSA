package com.shivaprasad.february.day55;

import java.util.ArrayList;
import java.util.List;

public class PascalsTraingleII {

    public static void main(String[] args) {
        System.out.println(getRow(3));
    }

    static List<Integer> getRow(int rowIndex) {
        if(rowIndex == 0){
            List<Integer> a = new ArrayList<>();
            a.add(1);
            return a;
        }
        List<Integer> b = getRow(rowIndex - 1);
        List<Integer> c = new ArrayList<>();
        c.add(1);
        for(int i =0;i<b.size()-1;i++){
            c.add(b.get(i) + b.get(i+1));
        }
        c.add(1);
        return c;
    }
}
