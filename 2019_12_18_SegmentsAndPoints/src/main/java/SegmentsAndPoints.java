/*Даны отрезки и точки на числовой прямой.
Найти для каждой точки количество отрезков,
которые её покрывают.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SegmentsAndPoints {
    public List<Integer> findTheNumberOfSegmentsForEachPoint (List<Segment> segments, List<Double> points) {
        int qtySegments = 0;
        List<Integer> result = new ArrayList<>();
        List<Point> listPoints = new ArrayList<>();
        for (Double aDouble : points) {
            Point point = new Point(0, aDouble);
            listPoints.add(point);
        }

        for (Segment segment : segments) {
            Point pointLeft = new Point(1, segment.getLeft());
            Point pointRight = new Point(2, segment.getRight());
            listPoints.add(pointLeft);
            listPoints.add(pointRight);
        }

        Collections.sort(listPoints);
        for (Point listPoint : listPoints) {
            if (listPoint.getKind() == 0) {
                result.add(qtySegments);
            }
            if (listPoint.getKind() == 1) {
                qtySegments++;
            }
            if (listPoint.getKind() == 2) {
                qtySegments--;
            }
        }

       /* System.out.println(listPoints);
        List<Integer> expected = Arrays.asList(0, 2, 1, 1, 1, 3, 0);*/
        return result;
    }

}
