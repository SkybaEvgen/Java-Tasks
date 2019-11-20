package com.telran;

import java.util.HashMap;
import java.util.Map;

public class FindNumber {

    public int findNumberInArrayWithoutPair1(int[] arr){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int n : arr){
            if(!hashMap.containsKey(n)){
                hashMap.put(n, 1);
            }else hashMap.put(n, hashMap.get(n) + 1);
        }
        for (Map.Entry entry : hashMap.entrySet()){
            if((int) entry.getValue() % 2 != 0){
                return (int) entry.getKey();
            }
        }
        return 0;
    }

    public int findNumberInArrayWithoutPair2(int[] numbers){
        Map<Integer, Integer> numberToQty = new HashMap<>();
        for (int number : numbers){
            Integer qty = numberToQty.get(number);
            if(qty==null)
                numberToQty.put(number, 1);
            else numberToQty.put(number, ++qty);
        }

        for (int number : numberToQty.keySet()){

            if (numberToQty.get(number) % 2 ==1)

                return number;
        }
        return -1;
    }
    public int findNumberInArrayWithoutPair (int[] numbers){
        int res = 0;
        for (int number : numbers){
            res ^= number;
        }
        return res;
    }

}
