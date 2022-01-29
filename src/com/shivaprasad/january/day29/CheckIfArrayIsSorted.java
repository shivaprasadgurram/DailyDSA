package com.shivaprasad.january.day29;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        System.out.println(arraySortedOrNot(new int[]{10,20,30,40,50},5));
        System.out.println(arraySortedOrNot(new int[]{10,20,70,40,50},5));
    }

    static boolean arraySortedOrNot(int[] arr, int n) {
        if(n == 1 || n == 0)
            return true;

        if(arr[n-1] < arr[n-2])
            return false;

        return arraySortedOrNot(arr,n-1);
    }
}
