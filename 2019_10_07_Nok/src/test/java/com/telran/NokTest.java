package com.telran;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NokTest {
    private FindNok findNok;

    @Before
    public void init(){
        findNok = new FindNok();
    }

    @Test
    public void nokTest1(){
        int a = 480;
        int b = 180;
        assertEquals(1440, findNok.nok(a, b));
    }

    @Test
    public void nokTest2(){
        int a = 24;
        int b = 12;
        assertEquals(24, findNok.nok(a, b));
    }

    @Test
    public void nokTest3(){
        int a = 50;
        int b = 180;
        assertEquals(900, findNok.nok(a, b));
    }

    @Test
    public void nokTest4(){
        int a = 1;
        int b = 17;
        assertEquals(17, findNok.nok(a, b));
    }

    @Test
    public void nokTest5(){
        int a = 19563097;
        int b = 1;
        assertEquals(19563097, findNok.nok(a, b));
    }

    @Test
    public void nokTest6(){
        int a = 36;
        int b = 84;
        System.out.println(findNok.nok(a, b));
//        assertEquals(144, findNok.nok(a, b));
    }
}
