/*есть словарь, т. е. Set<String> (в нем содержатся не повторяющиеся слова).
    есть строка String. Написать алгоритм, который принимает эту строку и выводит разбиение этой строки по словам, если это возможно.
    Выкинуь созданную свою Exception, если не удалось разбить строку на слова. (слова должны быть из словаря).
 */

package com.telran;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class VocabularyTest {
    private Vocabulary vocabulary;

    @Before
    public void init() {
        vocabulary = new Vocabulary();
    }

    @Test
    public void testRevealAllCompositeWords_oneWord(){
        Set vocabularySet = new HashSet(Arrays.asList("the", "therefore", "walking", "i", "go", "refore"));
        assertEquals(
                new HashSet<>(Arrays.asList("therefore")),
                vocabulary.revealAllCompositeWords(vocabularySet));
    }

    @Test
    public void testRevealAllCompositeWords_noWord(){
        Set vocabularySet = new HashSet(Arrays.asList("the", "therefore", "walking", "i", "go"));
        assertEquals(
                new HashSet<>(),
                vocabulary.revealAllCompositeWords(vocabularySet));
    }

    @Test
    public void testRevealAllCompositeWords_twoWord(){
        Set vocabularySet = new HashSet(Arrays.asList("the", "therefore", "walking", "i", "go", "refore", "goi"));
        assertEquals(
                new HashSet<>(Arrays.asList("goi", "therefore")),
                vocabulary.revealAllCompositeWords(vocabularySet));
    }
}
