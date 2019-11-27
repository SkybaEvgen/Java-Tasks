package com.telran;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfTextSubsequenceTest {
    private SumOfTextSubsequence subsequence;

    @Before
    public void init() {
        subsequence = new SumOfTextSubsequence();
    }

    @Test
    public void testPatternText1 () {
        assertTrue(subsequence.sumSubsequence ("Hello world", "HeolloHor"));

//        subsequence.sumSubsequence("Hello world", "HeolloHor");
    }

    @Test
    public void testPatternText2 () {
        assertTrue(subsequence.sumSubsequence ("Hello world", "Hd"));
    }

    @Test
    public void testPatternText3 () {
        assertTrue(subsequence.sumSubsequence ("Hello world", "d"));
    }

    @Test
    public void testPatternText4 () {
        assertTrue(subsequence.sumSubsequence ("Hello world", "oworolod"));
    }

    @Test
    public void testPatternText5 () {
        assertFalse(subsequence.sumSubsequence ("Hello world", "oH"));
    }

    @Test
    public void testPatternText6 () {
        assertTrue(subsequence.sumSubsequence ("d", "d"));
    }
}
