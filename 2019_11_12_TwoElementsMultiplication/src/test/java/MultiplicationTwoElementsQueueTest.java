import com.telran.MultiplicationTwoElements;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MultiplicationTwoElementsQueueTest {
    private MultiplicationTwoElements find;

    int [] array = {1, 2, 3, 4, 5, 9, 10, 12, 13, 15, 16, 19, 22, 24};

    @Before
    public void init() {
        find = new MultiplicationTwoElements();
    }

    @Test
    public void testFindTwoElementsMultipliers_1 () {
        assertTrue(find.findTwoElementsMultipliersQueue(array, 15));
    }

    @Test
    public void testFindTwoElementsMultipliers_2 () {
        assertTrue(find.findTwoElementsMultipliersQueue(array, 240));
    }

    @Test
    public void testFindTwoElementsMultipliers_3 () {
        assertFalse(find.findTwoElementsMultipliersQueue(array, 625));
    }

    @Test
    public void testFindTwoElementsMultipliers_4 () {
        assertFalse(find.findTwoElementsMultipliersQueue(array, 983041));
    }
}
