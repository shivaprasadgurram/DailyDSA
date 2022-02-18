package com.shivaprasad.february.day49;

import java.util.HashMap;

public class UniquePathsII {

    public static void main(String[] args) {
        int[][] obstacleGrid= {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }
    static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0] == 1) return 0;
        return totalWays(obstacleGrid,0,0,obstacleGrid.length,obstacleGrid[0].length,new HashMap<String,Integer>());
    }
    static int totalWays(int[][] obstacleGrid,int currentRow,int currentColumn,int noOfRows,int noOfColumns,HashMap<String,Integer> memo)
    {
        if(currentRow>=noOfRows || currentColumn>=noOfColumns || obstacleGrid[currentRow][currentColumn] == 1)
            return 0;

        if(currentRow == noOfRows-1 && currentColumn == noOfColumns-1)
            return 1;

        String key = currentRow+"_"+currentColumn;

        if(memo.containsKey(key))
            return memo.get(key);

        int rightDirection = totalWays(obstacleGrid,currentRow,currentColumn+1,noOfRows,noOfColumns,memo);
        int downDirection = totalWays(obstacleGrid,currentRow+1,currentColumn,noOfRows,noOfColumns,memo);

        memo.put(key,(rightDirection + downDirection));
        return rightDirection + downDirection;
    }
}
