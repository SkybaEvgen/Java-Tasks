/* Есть массив int [].
   Определить минимальное число больше 0 (min > 0),
   которое не лежит в массиве.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMinCountInArr {
    public int findMinPosNumNotLieInArr (int [] array) {
        int n;
        Arrays.sort(array);
        int maxCountInArr = array[array.length-1];
        List<Integer> list = new ArrayList<>();
        List<Integer> listTemp;
        for (int i = 1; i <= maxCountInArr; i++) {
            list.add(i);
        }
        if (list.size() == 0) {
            n = 1;
        }else {
            listTemp = list;
            for (int value : array) {
                for (int j = 0; j < listTemp.size(); j++) {
                    if (value == list.get(j)) {
                        list.remove(j);
                    }
                }
            }
            if (list.size() == 0) {
                n = array[array.length-1] +1;
            } else n = list.get(0);
        }
        return n;
    }
}
