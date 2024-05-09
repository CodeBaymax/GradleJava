package com.learn.algorithm;

public class BinarySearch {


    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,6,8,10,11};

        System.out.println(bSearch(arr, 3, 0, arr.length - 1));
    }

    public static int bSearch(int[] arr, int target, int left, int right) {

        if (arr[left] > target || arr[right] < target || left > right) {
            return -1;
        }

        int mid = (left + right) / 2;
        if (arr[mid] > target && left <= right) {
            return bSearch(arr, target, left, mid - 1);
        } else if (arr[mid] < target && left <= right) {
            return bSearch(arr, target, mid + 1, right);
        } else {
            return mid;
        }
    }

}
