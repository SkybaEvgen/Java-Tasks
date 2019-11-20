package com.telran;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrSortZeroFirstTest {
    ArrSortZeroFirst sortArr;

    @Before
    public void init() {
        sortArr = new ArrSortZeroFirst();
    }

    @Test
    public void arrSortTest1() {
        int[] expected = {0, 0, 1, 2, 8, -10, 3, -25};
        int[] input = {1, 2, 8, -10, 0, 3, 0, -25};
        Assert.assertArrayEquals(expected, sortArr.arrSort(input));
    }

    @Test
    public void arrSortTest2() {
        int[] expected = {1};
        int[] input = {1};
        Assert.assertArrayEquals(expected, sortArr.arrSort(input));
    }

    @Test
    public void arrSortTest3() {
        int[] expected = {0, -5};
        int[] input = {-5, 0};
        Assert.assertArrayEquals(expected, sortArr.arrSort(input));
    }

    @Test
    public void arrSortTest4() {
        int[] expected = {0, 1, -1};
        int[] input = {1, 0, -1};
        Assert.assertArrayEquals(expected, sortArr.arrSort(input));
    }
}
