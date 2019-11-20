/* Найти число k такое, что отрезок a, который начинается с числа k покрывает наибольшое количество
   точек из массива array*/

public class DoubleArr {
    public double getMaxCount (double[] array, double a) {
       int maxPoint = 0;
       double res = -100;
       for (double point : array) {
           int currentNumPoints = countPoint(array, point, a);
           if (currentNumPoints > maxPoint) {
               maxPoint = currentNumPoints;
               res = point;
           }
       }
       return res;
    }

    public int countPoint (double[] arr, double k, double a) {
        int countPoint = 0;
        for (double point : arr) {
            if (point >= k && point <= k + a) {
                countPoint++;
            }
        }
        return countPoint;
    }
}
