package com.telran;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindNumberTest {

    FindNumber findNumber;

    @Before
    public void init(){
        findNumber = new FindNumber();
    }

    @Test
    public void testfindNumberInArrayWithoutPair_onePair(){
        int[] arr = {2, 2, 5, 5, 130};
        assertEquals(130, findNumber.findNumberInArrayWithoutPair(arr));
    }

    @Test
    public void testfindNumberInArrayWithoutPair_twoPair(){
        int[] arr = {2, 2, 2, 2, 8};
        assertEquals(8, findNumber.findNumberInArrayWithoutPair(arr));
    }

    @Test
    public void testfindNumberInArrayWithoutPair_twoPairAndHalf(){
        int[] arr = {3,5,3,3,1,2,1,3,4,2,3,5,4};
        assertEquals(3, findNumber.findNumberInArrayWithoutPair(arr));
    }

    @Test
    public void testfindNumberInArrayWithoutPair_oneNumber(){
        int[] arr = {2};
        assertEquals(2, findNumber.findNumberInArrayWithoutPair(arr));
    }
}
