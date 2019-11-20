package com.telran;

import java.util.Arrays;

public class ArraysSorter {
    public int [] mergeSort(int[] array) {
        int lenth = array.length;
        if(lenth == 1) return array;

        int[] arrayLeft = Arrays.copyOfRange(array, 0, lenth/2);
        int[] arrayRight = Arrays.copyOfRange(array, lenth/2, lenth );

        return merge(mergeSort(arrayLeft), mergeSort(arrayRight));
    }

    private int[] merge(int[] arrayLeft, int[] arrayRight) {
        int lengthLeft = arrayLeft.length;
        int lengthRight = arrayRight.length;

        int length = lengthLeft + lengthRight;

        int[] res = new int [length];

        int i = 0;
        int j = 0;

        while (i + j < length) {
            if (i == lengthLeft) {
                System.arraycopy(arrayRight, j, res, i + j, lengthRight - j);
                break;
            } else if (j == lengthRight) {
                System.arraycopy(arrayLeft, i, res, i + j, lengthLeft - i);
                break;
            }else  {
                if (arrayLeft[i] < arrayRight[j]) {
                    res[i + j] = arrayLeft[i];
                    i++;
                } else {
                    res[i + j] = arrayRight[j];
                    j++;
                }
            }
        }
        return res;
    }
}
