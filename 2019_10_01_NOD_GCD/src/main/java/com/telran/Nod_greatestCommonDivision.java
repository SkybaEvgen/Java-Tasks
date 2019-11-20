package com.telran;

/* Найти НОД - наибольший общий делитель*/

public class Nod_greatestCommonDivision {

    public long nod_gcd(long a, long b){
        if (a == 0) return b;
        if (b == 0) return a;
        if (a % b == 0) return b;
        if (a > b){
            long c = a % b;
            a = b;
            b = c;
        }
        if (a < b){
            long c = b % a;
            b = a;
            a = c;
        }
        return nod_gcd(a, b);
    }
}
