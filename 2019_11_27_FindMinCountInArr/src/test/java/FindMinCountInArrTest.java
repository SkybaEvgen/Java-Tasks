import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMinCountInArrTest {
    private FindMinCountInArr find;

    @Before
    public void init () {
        find = new FindMinCountInArr();
    }

    @Test
    public void testFindMinCountInArr1 () {
        int[] arr = {5, 4, 2};
        assertEquals(1, find.findMinPosNumNotLieInArr(arr));
    }

    @Test
    public void testFindMinCountInArr2 () {
        int[] arr = {5, 1, 2, 4};
        assertEquals(3, find.findMinPosNumNotLieInArr(arr));
    }

    @Test
    public void testFindMinCountInArr3 () {
        int[] arr = {2};
        assertEquals(1, find.findMinPosNumNotLieInArr(arr));
    }

    @Test
    public void testFindMinCountInArr4 () {
        int[] arr = {-2, 3, 2, 1, 4};
        assertEquals(5, find.findMinPosNumNotLieInArr(arr));
    }

    @Test
    public void testFindMinCountInArr5 () {
        int[] arr = {-2, -3, -2, -1, -4};
        assertEquals(1, find.findMinPosNumNotLieInArr(arr));
    }

    @Test
    public void testFindMinCountInArr6 () {
        int[] arr = {-200, 200};
        assertEquals(1, find.findMinPosNumNotLieInArr(arr));
    }
}
