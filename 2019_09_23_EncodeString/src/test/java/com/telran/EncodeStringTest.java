package com.telran;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EncodeStringTest {
    EncodeString encodeString;

    @Before
    public void init() {
        encodeString = new EncodeString();
    }

    @Test
    public void testEncodeString(){
        String s = "a3b1c2a2";
        assertEquals(s, encodeString.encode("aaabccaa"));
    }

    @Test
    public void testEncodeStringOne(){
        String s = "a1";
        assertEquals(s, encodeString.encode("a"));
    }

    @Test
    public void testEncodeStringEmpty(){
        String s = "";
        assertEquals(s, encodeString.encode(""));
    }

    @Test
    public void testEncodeStringMany(){
        String s = "p5d6q8a2z1c6f13";
        assertEquals(s, encodeString.encode("pppppddddddqqqqqqqqaazccccccfffffffffffff"));
    }

}
