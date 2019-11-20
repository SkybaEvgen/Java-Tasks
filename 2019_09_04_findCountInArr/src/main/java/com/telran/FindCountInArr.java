package com.telran;

import java.util.Arrays;
import java.util.HashMap;

public class FindCountInArr {

    public static int findCountInArr(int[] arr){
        int n = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    n = arr[i];
                }
            }
        }
        return n;
    }

    public static int findCountInArrHashMap(int[] arr){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int findC = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(!hashMap.containsKey(arr[i])){
                hashMap.put(arr[i], 1);
            }else {
                findC = arr[i];
                return findC;
            }
        }
        return findC;
    }

    public static int findCountInArrSort(int[] arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1]){
                return arr[i];
            }
        }
        return 0;
    }
}
