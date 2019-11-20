package com.telran;

/* Найти НОК двух чисел а и b (a, b >= 1).
   НОК - наименьшее общее кратное
 */

import java.util.ArrayList;
import java.util.List;

public class FindNok {
    public int nok2 (int a, int b) {
        FindNod findNod = new FindNod();
        int nod = findNod.nod_gcd(a, b);
        return a * b/nod;
    }

    public int nok (int a, int b) {
        List<Integer> multipleA = new ArrayList<>();
        List<Integer> multipleB = new ArrayList<>();
        if(a < b) {
            for (int i = 1; i <= b ; i++) {
                multipleA.add(i * a);
            }
            for (int i = 1; i <= b; i++) {
                multipleB.add(i * b);
            }
        }

        if(a > b) {
            for (int i = 1; i <= a ; i++) {
                multipleA.add(i * a);
            }
            for (int i = 1; i <= a; i++) {
                multipleB.add(i * b);
            }
        }
        int c = -1;
        for (int i = 0; i < multipleA.size(); i++) {
            for (int j = 0; j < multipleB.size(); j++) {
                if(multipleA.get(i).equals(multipleB.get(j))){
                    c = multipleA.get(i);
                    return c;
                }
            }
        }
        return c;
    }
}
