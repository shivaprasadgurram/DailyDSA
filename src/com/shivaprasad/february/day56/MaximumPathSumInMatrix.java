package com.shivaprasad.february.day56;

public class MaximumPathSumInMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{348, 391},
                {618, 193}};
        System.out.println(maximumPath(2,matrix));
    }

    static int maximumPath(int N, int Matrix[][])
    {
        int cost = 0;
        int[][] memo = new int[N][N];
        for(int i=0;i<Matrix[0].length;i++){
            cost = Math.max(cost, maxCost(0, i, Matrix, N, memo));
        }
        return cost;
    }

    static int maxCost(int currentRow, int currentCol, int[][] matrix, int n, int[][] memo){

        if(currentRow < 0 || currentRow >= n || currentCol < 0 || currentCol >= n )
            return 0;

        if(currentRow==n-1){
            return matrix[currentRow][currentCol];
        }

        if(memo[currentRow][currentCol]!=0){
            return memo[currentRow][currentCol];
        }

        int downMove = matrix[currentRow][currentCol] + maxCost(currentRow + 1, currentCol, matrix, n, memo);

        int diagLeftMove = matrix[currentRow][currentCol] + maxCost(currentRow + 1, currentCol - 1, matrix, n, memo);

        int diagRightMove = matrix[currentRow][currentCol] + maxCost(currentRow + 1, currentCol + 1, matrix, n, memo);

        memo[currentRow][currentCol] =  Math.max(downMove, Math.max(diagLeftMove, diagRightMove));

        return memo[currentRow][currentCol];
    }
}
