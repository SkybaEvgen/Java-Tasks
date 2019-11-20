package com.telran;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagrammaTest {

    Anagramma anagramma;

    @Before
    public void init(){
        anagramma = new Anagramma();
    }

    @Test
    public void testAnagrammaTwoWords(){
        String word1 = "Thing";
        String word2 = "Night";
        assertTrue(anagramma.anagrammaTwoWords(word1, word2));
    }

    @Test
    public void testAnagrammaEmptyString(){
        String word1 = "";
        String word2 = "";
        assertTrue(anagramma.anagrammaTwoWords(word1, word2));
    }

    @Test
    public void testAnagrammaTwoWordsDifferentLength(){
        String word1 = "string";
        String word2 = "str";
        assertFalse(anagramma.anagrammaTwoWords(word1, word2));
    }

    @Test
    public void testAnagrammaIsNotWrong(){
        String word1 = "dog";
        String word2 = "cat";
        assertFalse(anagramma.anagrammaTwoWords(word1, word2));
    }


}
