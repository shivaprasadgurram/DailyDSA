package com.shivaprasad.february.day43;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows <=0)
            return result;

        for (int i=0; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            for (int j=0; j<i+1; j++)
                if (j==0 || j==i)
                    row.add(1);
                else
                    row.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
            result.add(row);
        }
        return result;
    }
}
