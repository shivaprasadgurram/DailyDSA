package com.shivaprasad.february.day32;

public class MinAndMaxElementInArray {

    public static void main(String[] args) {

        int arr[] = { 12, 1234, 45, 67, 1};
        System.out.println(getMin(arr,0,arr.length));
        System.out.println(getMax(arr,0,arr.length));
    }

    public static int getMin(int[] arr, int index, int n) {
        return (n == 1) ? arr[index] : Math.min(arr[index], getMin(arr, index + 1, n - 1));
    }

    public static int getMax(int[] arr, int index, int n) {
        return (n == 1) ? arr[index] : Math.max(arr[index], getMax(arr, index + 1, n - 1));
    }
}
