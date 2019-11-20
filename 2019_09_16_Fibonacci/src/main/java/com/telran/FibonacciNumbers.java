package com.telran;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FibonacciNumbers {

    private static int[] fibIndex;

    public static void main(String[] args) {
        int number = 46;
        fibIndex  = new int[number + 1];
        System.out.println(fibonacci_effectiveRecursion(number));
    }

    public int fibonacci_gettingTheNthNumber(int number){
        if(number == 0) return 0;
        int a = 0;
        int b = 1;
        for (int i = 2; i <= number; ++i) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
    }


    public static int fibonacci_recursion(int number){
        if(number == 0) return 0;
        else if(number == 1){
            return 1;
        }else {
            return fibonacci_recursion(number - 1) + fibonacci_recursion(number - 2);
        }
    }


    public static int fibonacci_effectiveRecursion(int number) {
        if (number <= 2) return 1;
        int result = fibIndex[number];
        if (result == 0) {
            result = fibonacci_effectiveRecursion(number - 1) + (fibonacci_effectiveRecursion(number - 2));
            fibIndex[number] = result;
        }
        return result;
    }
///////////////////////////////////////////////////////////////////////////////////////////

    private Map<Integer, BigInteger> cash = new HashMap<>();

    public BigInteger fibonacci_effectiveRecursionNew(int n) {
        if(n < 2)
            return BigInteger.valueOf(n);

        if(cash.containsKey(n))
            return cash.get(n);

        BigInteger res = fibonacci_effectiveRecursionNew(n - 1).add(fibonacci_effectiveRecursionNew(n - 2));
        cash.put(n, res);


        return BigInteger.valueOf(0);
    }
}
