package com.shivaprasad.february.day48;

import java.util.HashMap;

public class UniquePaths {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3,7));
    }

    static int uniquePaths(int m, int n) {
        return totalWays(0,0,m,n,new HashMap<String,Integer>());
    }

    static int totalWays(int currentRow,int currentColumn,int noOfRows,int noOfColumns,HashMap<String,Integer> memo)
    {
        if(currentRow == noOfRows-1 && currentColumn == noOfColumns-1)
            return 1;

        if(currentRow>=noOfRows || currentColumn>=noOfColumns)
            return 0;

        String key = currentRow+"_"+currentColumn;

        if(memo.containsKey(key))
            return memo.get(key);

        int rightDirection = totalWays(currentRow,currentColumn+1,noOfRows,noOfColumns,memo);
        int downDirection = totalWays(currentRow+1,currentColumn,noOfRows,noOfColumns,memo);

        memo.put(key,(rightDirection + downDirection));
        return rightDirection + downDirection;
    }
}
