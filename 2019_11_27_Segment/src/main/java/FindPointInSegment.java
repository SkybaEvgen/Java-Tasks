/*  На числовой прямой даны отрезки.
Найти минимальное количество точек так, чтобы каждый отрезок покрывал хотябы одну точку.
 */
import java.util.*;

public class FindPointInSegment {
    List<Integer> listPoints = new ArrayList<>();

    public List <Integer> findMinPointInSegment (List<Sections> sectionsList) {
        List<Integer> listLeft = new ArrayList<>();
        List<Integer> listRight = new ArrayList<>();
        for (int i = 0; i < sectionsList.size(); i++) {
            listLeft.add(sectionsList.get(i).getLeft());
            listRight.add(sectionsList.get(i).getRight());
        }

        Collections.sort(listLeft);
        Collections.sort(listRight);
        ArrayDeque<Integer> dequeLeft = new ArrayDeque<>();
        ArrayDeque<Integer> dequeRight = new ArrayDeque<>();

        for (int i = 0; i < sectionsList.size(); i++) {
            dequeLeft.add(listLeft.get(i));
            dequeRight.add(listRight.get(i));
        }

        listPoints = findPointsRecursion(dequeLeft, dequeRight);
        Set<Integer> sList = new HashSet<>(listPoints);
        return new ArrayList<>(sList);
    }

    public List<Integer> findPointsRecursion(ArrayDeque<Integer> left, ArrayDeque<Integer>right) {
        if (right.size() == 0 || left.size() == 0) return listPoints;
        if (right.getFirst() > left.getFirst()) {
            listPoints.add(right.getFirst());
            left.removeFirst();
        } else {
            right.removeFirst();
        }
        return findPointsRecursion(left, right);
    }
}

