package com.telran;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DevidedNTest {
    DevidedN devidedN;

    @Before
    public void init(){
        devidedN = new DevidedN();
    }

    @Test
    public void testdivisionByN_DividedBy3And5() {
        String s = "Devided 3 and Devided 5";
        assertEquals(s, devidedN.divisionByN(30));
    }

    @Test
    public void testdivisionByN_DividedBy3() {
        String s = "Devided 3";
        assertEquals(s, devidedN.divisionByN(9));
    }

    @Test
    public void testdivisionByN_DividedBy5() {
        String s = "Devided 5";
        assertEquals(s, devidedN.divisionByN(10));
    }

    @Test
    public void testdivisionByN_NotDivided() {
        int N = 8;
        String s = N + "";
        assertEquals(s, devidedN.divisionByN(N));
    }
}
