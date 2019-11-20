package com.telran;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Nod_greatestCommonDivisionTest {

    private Nod_greatestCommonDivision nod;

    @Before
    public void init(){
        nod = new Nod_greatestCommonDivision();
    }


    @Test
    public void nodTest1(){
        long a = 1800000000000000000L;
        long b = 4800000000000000000L;
//        System.out.println(nod.nod_gcd(a, b));
        assertEquals(600000000000000000L, nod.nod_gcd(a, b));
    }

    @Test
    public void nodTest2(){
        long a = 9050600009090008080L;
        long b = 6050200003020002020L;
        assertEquals(20, nod.nod_gcd(a, b));
    }

    @Test
    public void nodTest3(){
        long a = 18;
        long b = 48;
        assertEquals(6, nod.nod_gcd(a, b));
    }

    @Test
    public void nodTest4(){
        long a = 240;
        long b = 360;
        assertEquals(120, nod.nod_gcd(a, b));
    }


    @Test
    public void nodTest5(){
        long a = 1;
        long b = 1;
        assertEquals(1, nod.nod_gcd(a, b));
    }

    @Test
    public void nodTest6(){
        long a = 35;
        long b = 25;
        assertEquals(5, nod.nod_gcd(a, b));
    }

    @Test
    public void nodTest7(){
        long a = 18;
        long b = 30;
        assertEquals(6, nod.nod_gcd(a, b));
    }

    @Test
    public void nodTest8(){
        long a = 90;
        long b = 84;
        assertEquals(6, nod.nod_gcd(a, b));
    }

    @Test
    public void nodTest9(){
        long a = 96;
        long b = 140;
        assertEquals(4, nod.nod_gcd(a, b));
    }

    @Test
    public void nodTest10(){
        long a = 0;
        long b = 47;
        assertEquals(b, nod.nod_gcd(a, b));
    }

    @Test
    public void nodTest11(){
        long a = 52;
        long b = 0;
//        System.out.println(nod.nod_gcd(a, b));
        assertEquals(a, nod.nod_gcd(a, b));
    }

    @Test
    public void nodTest12(){
        long a = 25;
        long b = 12;
        System.out.println(nod.nod_gcd(a, b));
//        assertEquals(a, nod.nod_gcd(a, b));
    }
}
