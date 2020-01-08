import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SegmentsAndPointsTest {
    private SegmentsAndPoints segmentsAndPoints;

    @Before
    public void init() {
        segmentsAndPoints = new SegmentsAndPoints();
    }

    @Test
    public void testFindTheNumberOfSegmentsForEachPoint1() {
        ArrayList<Segment> segments = new ArrayList<>();
        Segment seg1 = new Segment(2.3, 4.2);
        Segment seg2 = new Segment(3.1, 5.5);
        Segment seg3 = new Segment(5.15, 7.9);
        Segment seg4 = new Segment(9.48, 13.5);
        Segment seg5 = new Segment(11.3, 14.41);
        Segment seg6 = new Segment(11.72, 15.4);
        segments.add(seg1);
        segments.add(seg2);
        segments.add(seg3);
        segments.add(seg4);
        segments.add(seg5);
        segments.add(seg6);
        List<Double> points = Arrays.asList(1.5, 3.6, 4.75, 7.43, 10.6, 12.3, 18.2);
        List<Integer> expected = Arrays.asList(0, 2, 1, 1, 1, 3, 0);
        assertEquals(expected, segmentsAndPoints.findTheNumberOfSegmentsForEachPoint(segments, points));

    }
}
