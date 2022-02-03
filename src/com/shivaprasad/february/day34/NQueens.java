package com.shivaprasad.february.day34;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

    public static void main(String[] args) {
        List<List<String>> res = solveNQueens(4);
        System.out.println(res);
    }

    static List<List<String>> solveNQueens(int n) {
        List<List<String>> output = new ArrayList<>();
        char[][] grid = new char[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                grid[i][j] = '.';
            }
        }

        nQueens(grid,0,n,output);
        return output;
    }

    static void nQueens(char[][] grid, int currentRow, int n, List<List<String>> output) {

        if(currentRow >= n)
        {
            List<String> t = populateCorrectAnswer(grid,n);
            output.add(new ArrayList<>(t));
            return;
        }

        for(int currentCol=0;currentCol<n;currentCol++)
        {
            if(isValid(currentRow,currentCol,grid,n))
            {
                grid[currentRow][currentCol] = 'Q';
                nQueens(grid,currentRow+1,n,output);
                grid[currentRow][currentCol] = '.';
            }
        }

        return;
    }

    static List<String> populateCorrectAnswer(char[][] grid, int n) {
        List<String> ans = new ArrayList<>();
        for(int currentRow=0;currentRow<n;currentRow++)
        {
            String temp="";
            for(int currentCol=0;currentCol<n;currentCol++)
            {
                temp+=grid[currentRow][currentCol];
            }
            ans.add(temp);
        }
        return ans;
    }

    static boolean isValid(int currentRow, int currentCol, char[][] grid, int n) {

        return isRowValid(currentRow,grid,n) && isColValid(currentCol,grid,n)
                && areDiagonalsValid(currentRow,currentCol,grid,n);
    }

    static boolean isRowValid(int currentRow, char[][] grid, int n) {

        for(int j=0;j<n;j++)
        {
            if(grid[currentRow][j] == 'Q')
                return false;
        }
        return true;
    }

    static boolean isColValid(int currentCol, char[][] grid, int n) {
        for(int j=0;j<n;j++)
        {
            if(grid[j][currentCol] == 'Q')
                return false;
        }
        return true;
    }

    static boolean areDiagonalsValid(int currentRow, int currentCol, char[][] grid, int n) {

        int i = currentRow;
        int j = currentCol;

        while(i>=0 && j>=0)
        {
            if(grid[i][j] == 'Q')
                return false;
            i -= 1;
            j -= 1;
        }

        i = currentRow;
        j = currentCol;

        while(i>=0 && j < n)
        {
            if(grid[i][j] == 'Q')
                return false;
            i -=1;
            j +=1;
        }

        i = currentRow;
        j = currentCol;

        while(i < n && j < n)
        {
            if(grid[i][j] == 'Q')
                return false;
            i +=1;
            j +=1;
        }

        i = currentRow;
        j = currentCol;

        while(i<n && j >= 0)
        {
            if(grid[i][j] == 'Q')
                return false;
            i +=1;
            j -=1;
        }
        return true;
    }
}
