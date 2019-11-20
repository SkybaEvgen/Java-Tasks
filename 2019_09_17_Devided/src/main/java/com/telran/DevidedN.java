package com.telran;

public class DevidedN {
    public String divisionByN(int N){
        if((N % 3 == 0) && (N % 5 == 0)) return ("Devided " + 3) +" and "+ ("Devided " + 5);
        if(N % 3 == 0) return "Devided " + 3;
        if(N % 5 == 0) return "Devided " + 5;
        else return N + "";
    }
}
