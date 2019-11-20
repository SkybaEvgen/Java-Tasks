package com.telran.reverse_string;

public class StringReverser {

    public String reverse(String str){
        StringBuilder sb = new StringBuilder(str);  // обернули входящую строку (str) в объект типа StringBuilder
        sb.reverse();
        return sb.toString();
    }
}
