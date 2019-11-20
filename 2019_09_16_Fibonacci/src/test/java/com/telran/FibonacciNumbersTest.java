package com.telran;

import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class FibonacciNumbersTest {
    FibonacciNumbers fibonacciNumbers;

    private static int[] fibIndex;


    @Before
    public void init(){
        fibonacciNumbers = new FibonacciNumbers();
    }

    @Test
    public void testFobonacciMaxInt(){
        assertEquals(1836311903, fibonacciNumbers.fibonacci_gettingTheNthNumber(46));
    }

    @Test
    public void testFibonacciMinInt(){
        assertEquals(0, fibonacciNumbers.fibonacci_gettingTheNthNumber(0));
    }

    @Test
    public void testFibonacciHalfInt(){
        assertEquals(28657, fibonacciNumbers.fibonacci_gettingTheNthNumber(23));
    }



//      Fibonacci recursion

    @Test
    public void testFibonacci_recursionMaxInt(){
        assertEquals(1836311903, fibonacciNumbers.fibonacci_recursion(46));
    }

    @Test
    public void testFibonacci_recursionMinInt(){
        assertEquals(0, fibonacciNumbers.fibonacci_recursion(0));
    }

    @Test
    public void testFibonacci_recursionHalfInt(){
        assertEquals(28657, fibonacciNumbers.fibonacci_recursion(23));
    }


//    Effective Recursion

    @Test
    public void testfibonacci_effectiveRecursionMaxInt(){

    }

    @Test
    public void testfibonacci_effectiveRecursionMinInt(){

    }

    @Test
    public void testfibonacci_effectiveRecursionHalfInt(){

    }

//    Effective Recursion2

    @Test
    public void testCompute_0_0(){

    }

    @Test
    public void testCompute_1_1(){

    }
}
