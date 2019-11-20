import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueuePoints {

    public double getMaxCount (double [] array, double a) {
        Arrays.sort(array);
        double res = array[0];
        double maxPoint = 0;
        LinkedList<Double> queue = new LinkedList<>();
        for (double point : array) {
            queue.add(point);
            while (point - queue.peekFirst() > a){
                queue.removeFirst();
            }
            if(maxPoint < queue.size()) {
                maxPoint = queue.size();
                res = queue.peekFirst();
            }
        }
        return res;
    }

}
