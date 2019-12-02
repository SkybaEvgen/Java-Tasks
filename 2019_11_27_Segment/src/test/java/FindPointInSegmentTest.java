import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class FindPointInSegmentTest {

    private FindPointInSegment findPoints;

    @Before
    public void init() {
        findPoints = new FindPointInSegment();
    }

    @Test
    public void testFindPointInSegment1() {
        Sections section1 = new Sections(1, 8);
        Sections section2 = new Sections(3, 4);
        Sections section3 = new Sections(2, 5);
        Sections section4 = new Sections(6, 7);
        List<Sections> listRes = Arrays.asList(section1, section2, section3, section4);
        List<Integer> expected = Arrays.asList(4, 7);
        assertEquals(expected, findPoints.findMinPointInSegment(listRes));
    }

    @Test
    public void testFindPointInSegment2() {
        Sections section1 = new Sections(0, 3);
        Sections section2 = new Sections(2, 8);
        Sections section3 = new Sections(10, 15);
        List<Sections> listRes = Arrays.asList(section1, section2, section3);
        List<Integer> expected = Arrays.asList(3, 15);
        assertEquals(expected, findPoints.findMinPointInSegment(listRes));
    }

    @Test
    public void testFindPointInSegment3() {
        Sections section1 = new Sections(0, 3);
        Sections section2 = new Sections(10, 15);
        List<Sections> listRes = Arrays.asList(section1, section2);
        List<Integer> expected = Arrays.asList(3, 15);
        assertEquals(expected, findPoints.findMinPointInSegment(listRes));
    }

    @Test
    public void testFindPointInSegment4() {
        Sections section1 = new Sections(0, 3);
        List<Sections> listRes = Arrays.asList(section1);
        List<Integer> expected = Arrays.asList(3);
        assertEquals(expected, findPoints.findMinPointInSegment(listRes));
    }

    @Test
    public void testFindPointInSegment5() {
        Sections section1 = new Sections(0, 20);
        Sections section2 = new Sections(5, 10);
        List<Sections> listRes = Arrays.asList(section1, section2);
        List<Integer> expected = Arrays.asList(10);
        assertEquals(expected, findPoints.findMinPointInSegment(listRes));
//        System.out.println(findPoints.findMinPointInSegment(listRes));
    }
}
