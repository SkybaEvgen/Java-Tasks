package com.telran;

import java.util.Arrays;

public class MergeSort {

    public int[] mergeSort(int[] arr) {
        int len = arr.length;
        if (len < 2) return arr;
        int middle = len / 2;
        return merge(mergeSort(Arrays.copyOfRange(arr, 0, middle)),
                mergeSort(Arrays.copyOfRange(arr, middle, len)));
    }

    public int[] merge(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        int count_arr1 = 0;
        int count_arr2 = 0;
        int len = length1 + length2;
        int[] result = new int[len];

        for (int i = 0; i < len; i++) {
            if (count_arr2 < length2 && count_arr1 < length1) {
                if (arr1[count_arr1] > arr2[count_arr2]) result[i] = arr2[count_arr2++];
                else result[i] = arr1[count_arr1++];
            } else if (count_arr2 < length2) {
                result[i] = arr2[count_arr2++];
            } else {
                result[i] = arr1[count_arr1++];
            }
        }
        return result;
    }
}
