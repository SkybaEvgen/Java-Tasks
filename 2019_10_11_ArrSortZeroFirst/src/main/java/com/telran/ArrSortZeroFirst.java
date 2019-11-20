package com.telran;

import java.util.ArrayList;
import java.util.List;

public class ArrSortZeroFirst {
    public int [] arrSort (int [] arr) {
        List<Integer> list = new ArrayList<>();
        for (int value : arr) {

            if (value == 0) list.add(0, value);

            else list.add(value);

        }

        int[] arrOut = list.stream().mapToInt(i -> i).toArray();

        return arrOut;
    }
}
