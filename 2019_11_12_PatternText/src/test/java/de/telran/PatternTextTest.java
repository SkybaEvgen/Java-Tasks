package de.telran;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PatternTextTest {
    private PatternText patText;

    @Before
    public void init () {
    patText = new PatternText();
    }

    @Test
    public void testPatternText1 () {
        assertTrue(patText.patternText("Hwd", "Hello world"));
    }

    @Test
    public void testPatternText2 () {
        assertTrue(patText.patternText("q", "q"));
    }

    @Test
    public void testPatternText3 () {
        assertFalse(patText.patternText("q", "w"));
    }

    @Test
    public void testPatternText4 () {
        assertTrue(patText.patternText("Lor Ipislymmy te", "Lorem Ipsum is simply dummy text"));
    }

    @Test
    public void testPatternText5 () {
        assertTrue(patText.patternText("", "Hello world"));
    }

}
