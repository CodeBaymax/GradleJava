package com.learn.topic;

public class TwoSortedArray {

    public static void main(String[] args) {
//        int[] num1 = new int[]{1, 3};
//        int[] num2 = new int[]{2};
        int[] num1 = new int[]{1, 2};
        int[] num2 = new int[]{3, 4};

        System.out.println(findMedianSortedArrays(num1, num2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size1 = nums1.length;
        int size2 = nums2.length;

        int size = size1 + size2;

        boolean computeFlag = false;
        if (size % 2 == 0) {
            computeFlag = true;
        }

        int times = size / 2 + 1;
        int index1 = 0;
        int index2 = 0;

        double temp1 = Math.pow(10, 6);
        double temp2 = Math.pow(10, 6);

        double res = 0;
        for (int i = 0; i < times; i++) {

            if (index1 >= nums1.length) {
                temp1 = Math.pow(10, 6);
            } else {
                temp1 = nums1[index1];
            }

            if (index2 >= nums2.length) {
                temp2 = Math.pow(10, 6);
            } else {
                temp2 = nums2[index2];
            }

            if (temp1 <= temp2) {
                index1++;
                if (computeFlag && i == times - 2) {
                    res = temp1;
                }
                continue;
            }

            index2++;
            if (computeFlag && i == times - 2) {
                res = temp2;
            }
        }

        if (computeFlag) {
            return ((res + Math.min(temp2, temp1)) / 2);
        }

        return Math.min(temp2, temp1);
    }
}
