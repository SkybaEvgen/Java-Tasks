package com.telran;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MergeSortTest {
    MergeSort mergeSort;

    @Before
    public void init() {
        mergeSort = new MergeSort();
    }

    @Test
    public void mergeSortTest1() {
        int[] expected = {-16, -4, 0, 7, 23, 38, 196};
        int[] input = {23, -4, 196, 7, 0, -16, 38};
        Assert.assertArrayEquals(expected, mergeSort.mergeSort(input));
    }

    @Test
    public void mergeSortTest2() {
        int[] expected = {1, 5};
        int[] input = {5, 1};
        Assert.assertArrayEquals(expected, mergeSort.mergeSort(input));
    }

    @Test
    public void mergeSortTest3() {
        int[] expected = {-45, -3, 3, 3, 18};
        int[] input = {18, 3, -45, 3, -3};
        Assert.assertArrayEquals(expected, mergeSort.mergeSort(input));
    }

    @Test
    public void testMergeSort_6_number () {

    }
}
