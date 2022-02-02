package com.shivaprasad.february.day33;

import java.util.ArrayList;
import java.util.Collections;

//GeeskForGeeks: https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1
public class RatInAMazeIWay2 {
    public static void main(String[] args) {

        int[][] input = {{1, 0, 0, 0},
                         {1, 1, 0, 1},
                         {1, 1, 0, 0},
                         {0, 1, 1, 1}};

        ArrayList<String> res = findPath(input,4);
        System.out.println(res);
    }

    public static ArrayList<String> findPath(int[][] matrix, int n) {
        ArrayList<String> answer = new ArrayList<String>();
        genarateWays(matrix,0,0,n,"",answer);
        return answer;
    }

    private static void genarateWays(int[][] matrix, int currentRow, int currentColumn, int n, String currentAns, ArrayList<String> answer) {

        if(currentRow < 0 || currentRow >= n || currentColumn < 0 || currentColumn >=n || matrix[currentRow][currentColumn] == 0)
        {
            return;
        }

        if(currentRow == n-1 && currentColumn == n-1)
        {
            answer.add(currentAns);
            return;
        }

        matrix[currentRow][currentColumn] = 0;

        //Calling recursively in lexicographically increasing order
        //down move
        genarateWays(matrix,currentRow+1,currentColumn,n,currentAns+"D",answer);

        //left move
        genarateWays(matrix,currentRow,currentColumn-1,n,currentAns+"L",answer);

        //right move
        genarateWays(matrix,currentRow,currentColumn+1,n,currentAns+"R",answer);

        //up move
        genarateWays(matrix,currentRow-1,currentColumn,n,currentAns+"U",answer);

        matrix[currentRow][currentColumn] = 1;

        return;
    }
}
