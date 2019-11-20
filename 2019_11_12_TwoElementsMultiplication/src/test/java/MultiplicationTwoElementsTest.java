import com.telran.MultiplicationTwoElements;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationTwoElementsTest {
    private MultiplicationTwoElements find;

    int [] array = {1, 2, 3, 4, 5, 9, 10, 12, 13, 15, 16, 19, 22, 24, 96, 1024};
    int [] array2 = {2, 4, 8, 16, 65536};

    @Before
    public void init () {
        find = new MultiplicationTwoElements();
    }

    @Test
    public void testFindTwoElementsMultipliers_1 () {
        assertTrue(find.findTwoElementsMultipliers(array, 15));
    }

    @Test
    public void testFindTwoElementsMultipliers_2 () {
        assertTrue(find.findTwoElementsMultipliers(array, 240));
    }

    @Test
    public void testFindTwoElementsMultipliers_3 () {
        assertFalse(find.findTwoElementsMultipliers(array, 625));
    }

    @Test
    public void testFindTwoElementsMultipliers_4 () {
        assertFalse(find.findTwoElementsMultipliers(array, 983081));
    }

    @Test
    public void testFindTwoElementsMultipliers_5 () {
        assertTrue(find.findTwoElementsMultipliers(array2, 1048576));
    }



}
