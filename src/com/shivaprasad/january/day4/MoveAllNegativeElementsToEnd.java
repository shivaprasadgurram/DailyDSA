package com.shivaprasad.january.day4;

//GeeksForGeeks:  https://practice.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1
public class MoveAllNegativeElementsToEnd {

    public static void main(String[] args) {

        int[] arr = {1,-1,3,2,-7,-5,11,6};

        segregateElements(arr,arr.length);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] +"  ");
        }

    }

    public static void segregateElements(int arr[], int n)
    {
        int[] tempArr = new int[n];
        int j = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] > 0)
                tempArr[j++] = arr[i];
        }

        if(j == n || j == 0)
            return;

        for(int i=0;i<n;i++)
        {
            if(arr[i] < 0)
                tempArr[j++] = arr[i];
        }

        for(int i=0;i<n;i++)
        {
            arr[i] = tempArr[i];
        }

        //T.C: O(n)
        //S.C: O(n)
    }
}
