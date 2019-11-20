package com.telran.string.inverter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringInverterTest {

    StringInverter stringInverter;

    @Before
    public void init(){
        stringInverter = new StringInverter();
    }

    @Test
    public void testInverter_EmptyString(){
        assertEquals(stringInverter.inverter(""), "");
    }

    @Test
    public void testInverter_OneWord(){
        assertEquals(stringInverter.inverter("String"), "sTRING");
    }

    @Test
    public void testInverter_OneLetter(){
        assertEquals(stringInverter.inverter("a"), "A");
    }

    @Test
    public void testInverter_TwoWordsWithSpace(){
        assertEquals(stringInverter.inverter("Telran Is GrEat"), "tELRAN iS gReAT");
    }

    @Test
    public void testInverter_NonLetterCharacter(){
        assertEquals(stringInverter.inverter("Telran Is Great!+5"), "tELRAN iS gREAT!+5");
    }
}
