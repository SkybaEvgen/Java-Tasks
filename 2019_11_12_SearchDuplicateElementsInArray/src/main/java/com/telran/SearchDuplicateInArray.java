/* Есть массив int. Определить, есть ли в нем элемент, повторяющийся более половины раз
 (строго больше) например, {1,2,3,1,1}. ввод массив, вывод boolean*/

package com.telran;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class SearchDuplicateInArray {
    public boolean searchDuplicate1 (int [] array) {
        if (array.length == 1) return false;
        int count = 1;
        int countMax = 1;
        Arrays.sort(array);
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == array[i+1]) {
                countMax++;
            }
            if (array[i] != array[i+1]) {
                countMax = 1;
            }
            if (countMax > count) {
                count = countMax;
            }
        }
        return count > (array.length) / 2;
    }


    public boolean searchDuplicate (int [] array) {
        if (array.length == 1) return false;
        HashMap<Integer, Integer> arrayHashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!arrayHashMap.containsKey(array[i])) {
                arrayHashMap.put(array[i], 1);
            }else arrayHashMap.put(array[i], arrayHashMap.get(array[i]) + 1);
        }
        int maxValue = Collections.max(arrayHashMap.values());
        return maxValue > (array.length) / 2;
    }

    /*public boolean searchDuplicate (int [] array) {

        return searchDuplicate(array, 0, array.length - 1);
    }

    public int searchDuplicate (int [] array, int left, int right){
        if (left == right) {
            return -1;
        }
        if (left + 1 == right) {
            return array[left];
        }

        int middle = (right + left) / 2;
        int mLeft =
    }*/

}
