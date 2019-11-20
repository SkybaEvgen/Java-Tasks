package com.telran;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchDuplicateInArrayTest {
    private SearchDuplicateInArray search;

    @Before
    public void init () {
        search = new SearchDuplicateInArray();
    }

    @Test
    public void testSearchDuplicateInArray1 () {
        int[] arr = {1,2,3,1,1};
        assertTrue(search.searchDuplicate(arr));
    }

    @Test
    public void testSearchDuplicateInArray2 () {
        int[] arr = {1,2,3,1,1,2,3,2,2,5,2,9,8,7,2,2,2,2,2};
        assertTrue(search.searchDuplicate(arr));
    }

    @Test
    public void testSearchDuplicateInArray3 () {
        int[] arr = {1,2,3,3};
        assertFalse(search.searchDuplicate(arr));
    }

    @Test
    public void testSearchDuplicateInArray4 () {
        int[] arr = {1,1};
        assertTrue(search.searchDuplicate(arr));
    }

    @Test
    public void testSearchDuplicateInArray5 () {
        int[] arr = {1};
        assertFalse(search.searchDuplicate(arr));
    }
}
