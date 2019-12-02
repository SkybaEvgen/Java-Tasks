import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindFirstPositivTest {
    private FindFirstPositiv find;

    @Before
    public void init () {
        find = new FindFirstPositiv();
    }

    @Test
    public void testFindMinCountInArr1 () {
        int[] arr = {5, 4, 2};
        assertEquals(1, find.findFirstPositive(arr));
    }

    @Test
    public void testFindMinCountInArr2 () {
        int[] arr = {5, 1, 2, 4};
        assertEquals(3, find.findFirstPositive(arr));
    }

    @Test
    public void testFindMinCountInArr3 () {
        int[] arr = {2};
        assertEquals(1, find.findFirstPositive(arr));
    }

    @Test
    public void testFindMinCountInArr4 () {
        int[] arr = {-2, 3, 2, 1, 4};
        assertEquals(5, find.findFirstPositive(arr));
    }

    @Test
    public void testFindMinCountInArr5 () {
        int[] arr = {-2, -3, -2, -1, -4};
        assertEquals(1, find.findFirstPositive(arr));
    }

    @Test
    public void testFindMinCountInArr6 () {
        int[] arr = {-200, 900000000};
        assertEquals(1, find.findFirstPositive(arr));
    }
}
