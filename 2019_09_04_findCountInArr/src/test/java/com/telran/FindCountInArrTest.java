package com.telran;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FindCountInArrTest {
    FindCountInArr findCountInArr;

    @Before
    public void init(){
        findCountInArr = new FindCountInArr();
    }

    @Test
    public void testFindCountInArr_inputOne_outputArr121(){
        int a[] = {1, 2, 1};
        assertEquals(1, findCountInArr.findCountInArr(a));
    }

    @Test
    public void testFindCountInArr_inputOne_outputArr11(){
        int a[] = {1,1};
        assertEquals(1, findCountInArr.findCountInArr(a));
    }

    @Test
    public void testFindCountInArr_inputOne_outputArr4TwoDuplication(){
        int a[] = {1,2,1,2};
        assertTrue(findCountInArr.findCountInArr(a) == 2 || findCountInArr.findCountInArr(a) == 1);
    }
}


