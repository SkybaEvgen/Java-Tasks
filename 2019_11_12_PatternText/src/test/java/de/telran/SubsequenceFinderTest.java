package de.telran;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import static org.junit.Assert.assertTrue;

public class SubsequenceFinderTest {

    SubsequenceFinder finder;

    String text = "Hello world";

    @Before
    public void init() {
        finder = new SubsequenceFinder();
    }

    private String getRandomSubsequence(String text, int length) {
        Set<Integer> indexSet = new TreeSet<>();

        Random random = new Random();

        while (indexSet.size() < length) {
            indexSet.add(random.nextInt(text.length()));
        }

        return indexSet.stream()
                .map(text::charAt)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    @Test
    public void testIsSubsequence_1 () {
        assertTrue(finder.isSubsequence("", text));
    }

    @Test
    public void testIsSubsequence_2 () {
        assertTrue(finder.isSubsequence("llo", text));
    }

    @Test
    public void testIsSubsequence_5randomLetters () {
        for (int i = 0; i < 100; i++) {
            String pattern = getRandomSubsequence(text, 5);
            assertTrue(finder.isSubsequence(pattern, text));
        }
    }
}
