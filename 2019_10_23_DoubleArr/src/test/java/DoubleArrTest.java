import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoubleArrTest {
    private QueuePoints doubleArr;

    @Before
    public void init () {
        doubleArr = new QueuePoints();
    }

    @Test
    public void testGetMaxCount_1 () {
        double [] arr = {-15.3, 2.6, 5.5, 4.96, -8.12, 0, 9.7, 23.17, -2, -7.5, -5, -3};
        assertEquals(-8.12, doubleArr.getMaxCount(arr, 9), 0.1);
    }

    @Test
    public void testGetMaxCount_2 () {
        double [] arr = {7, 18};
        assertEquals(7.0, doubleArr.getMaxCount(arr, 2), 0.1);
    }

    @Test
    public void testGetMaxCount_3 () {
        double [] arr = {9, 7, 2, 4};
        assertEquals(2.0, doubleArr.getMaxCount(arr, 3), 0.1);
    }

    @Test
    public void testGetMaxCount_4 () {
        double [] arr = {9, 7, 2, 4, 1};
        assertEquals(1.0, doubleArr.getMaxCount(arr, 3), 0.1);
    }

    @Test
    public void testGetMaxCount_5 () {
        double [] arr = {4.58};
//        System.out.println(doubleArr.getMaxCount(arr, 1));
        assertEquals(4.58, doubleArr.getMaxCount(arr, 3), 0.1);
    }
}
