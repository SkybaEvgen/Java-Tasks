package com.telran;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArraysSorterTest {

    private ArraysSorter arraysSorter;

    @Before
    public void init() {
        arraysSorter = new ArraysSorter();
    }

    @Test
    public void testMergeSort_2numbersSorted () {
        int[] res = new int[] {4, 5};
        assertArrayEquals(res, arraysSorter.mergeSort(res));
    }

    @Test
    public void testMergeSort_2numbers () {
        int[] res = new int[] {5, 4};
        assertArrayEquals(new int[] {4, 5}, arraysSorter.mergeSort(res));
    }

    @Test
    public void testMergeSort_5numbers () {
        int[] res = new int[] {5, 4, 10, 19, 3};
        assertArrayEquals(new int[] {3, 4, 5, 10, 19}, arraysSorter.mergeSort(res));
    }

    @Test
    public void testMergeSort_56numbers () {
        int[] res = new int[] {5, 4, 9, 1, 0, -1};
        assertArrayEquals(new int[] {-1, 0, 1, 4, 5, 9}, arraysSorter.mergeSort(res));
    }


}
