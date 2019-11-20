package com.telran;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FindCountInArrHashMapTest {

    private FindCountInArr findCountInArrHashMap;

    @Before
    public void init(){
        findCountInArrHashMap = new FindCountInArr();
    }

    @Test
    public void testFindCountInArr_inputOne_outputArr121(){
        int a[] = {1, 2, 2};
        assertEquals(2, findCountInArrHashMap.findCountInArrHashMap(a));
    }

    @Test
    public void testFindCountInArr_inputOne_outputArr11(){
        int a[] = {1,1};
        assertEquals(1, findCountInArrHashMap.findCountInArrHashMap(a));
    }

    @Test
    public void testFindCountInArr_inputOne_outputArr4TwoDuplication(){
        int a[] = {1,2,1,2};
        assertTrue(findCountInArrHashMap.findCountInArrHashMap(a) == 2 || findCountInArrHashMap.findCountInArrHashMap(a) == 1);
    }

}
