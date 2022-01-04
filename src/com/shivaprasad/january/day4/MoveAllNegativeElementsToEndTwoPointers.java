package com.shivaprasad.january.day4;

//If order of elements is not a matter, Here we no need to have a separate temp array, We can apply in-place algorithm
//GeeksForGeeks:  https://practice.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1
public class MoveAllNegativeElementsToEndTwoPointers {

    public static void main(String[] args) {

        int[] arr = {-5, 7, -3, -4, 9, 10, -1, 11};

        segregateElements(arr,arr.length);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] +"  ");
        }

    }

    public static void segregateElements(int arr[], int n)
    {
        int l = 0, r = n-1;

        while(l < r)
        {
            if(arr[l] > 0 && arr[r] < 0)
            {
                l++;
                r--;
            }

            else if(arr[l] < 0 && arr[r] > 0)
            {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }

            else if(arr[l] > 0 && arr[r] > 0)
                l++;

            else
                r--;
        }

        //T.C: O(n)
        //S.C: O(1)
    }
}
