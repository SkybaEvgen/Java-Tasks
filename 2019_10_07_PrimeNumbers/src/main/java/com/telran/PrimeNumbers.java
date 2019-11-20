package com.telran;

/* Получить список простых чисел до натурального числа n.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumbers {
    public List<Integer> primeNumber(int n){                        // Решето Эратосфена
        List<Integer> listPrimeNumbers = new ArrayList<>();
        boolean[] arrPrime = new boolean[n + 1];
        Arrays.fill(arrPrime, true);
        arrPrime[0] = false;
        arrPrime[1] = false;

        for (int i = 2; i < arrPrime.length ; i++) {
            if(arrPrime[i]){
                for (int j = 2; i * j < arrPrime.length; j++) {
                    arrPrime[i * j] = false;
                }
            }
        }

        for (int i = 0; i < arrPrime.length; i++) {
            if(arrPrime[i]){
                listPrimeNumbers.add(i);
            }
        }

        return listPrimeNumbers;
    }
}