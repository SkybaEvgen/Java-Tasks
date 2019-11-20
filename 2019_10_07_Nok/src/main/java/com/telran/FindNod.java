package com.telran;

/* Найти НОД - наибольший общий делитель*/

public class FindNod {

    public int nod_gcd(int a, int b){
        if (a == 0) return b;
        if (b == 0) return a;
        if (a % b == 0) return b;
        if (a > b){
            int c = a % b;
            a = b;
            b = c;
        }
        if (a < b){
            int c = b % a;
            b = a;
            a = c;
        }
        return nod_gcd(a, b);
    }
}
