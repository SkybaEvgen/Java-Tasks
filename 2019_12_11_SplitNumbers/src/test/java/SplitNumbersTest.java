import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SplitNumbersTest {
    private SplitNumbers splitNumbers;

    @Before
    public void init() {
        splitNumbers = new SplitNumbers();
    }

    @Test
    public void testSplitNumbers1() {
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, splitNumbers.splitByTheSumOfVariousNaturalNumbers(6));
    }

    @Test
    public void testSplitNumbers2() {
        List<Integer> expected = Arrays.asList(1, 2, 5);
        assertEquals(expected, splitNumbers.splitByTheSumOfVariousNaturalNumbers(8));
    }

    @Test
    public void testSplitNumbers3() {
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        assertEquals(expected, splitNumbers.splitByTheSumOfVariousNaturalNumbers(10));
    }

    @Test
    public void testSplitNumbers4() {
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 8);
        assertEquals(expected, splitNumbers.splitByTheSumOfVariousNaturalNumbers(18));
    }

    @Test
    public void testSplitNumbers5() {
        List<Integer> expected = Arrays.asList(2);
        assertEquals(expected, splitNumbers.splitByTheSumOfVariousNaturalNumbers(2));
    }

    @Test
    public void testSplitNumbers6() {
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 16);
        assertEquals(expected, splitNumbers.splitByTheSumOfVariousNaturalNumbers(44));
    }
}
