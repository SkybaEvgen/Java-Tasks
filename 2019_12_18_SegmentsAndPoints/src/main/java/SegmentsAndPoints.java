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

        for (Double pointValue : points) {
            Point point = new Point(0, pointValue);
            listPoints.add(point);
        }

        for (Segment segmentValue : segments) {
            Point pointLeft = new Point(1, segmentValue.getLeft());
            Point pointRight = new Point(2, segmentValue.getRight());
            listPoints.add(pointLeft);
            listPoints.add(pointRight);
        }

        Collections.sort(listPoints);
        for (Point listPointValue : listPoints) {
            if (listPointValue.getKind() == 0) {
                result.add(qtySegments);
            }
            if (listPointValue.getKind() == 1) {
                qtySegments++;
            }
            if (listPointValue.getKind() == 2) {
                qtySegments--;
            }
        }
        return result;
    }

}
