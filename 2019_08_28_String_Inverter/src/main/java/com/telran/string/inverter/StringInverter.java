package com.telran.string.inverter;

public class StringInverter {

    public String inverter(String str){
        char[] chars = str.toCharArray();  //вытаскиваем из входящей строки массив char

        for (int i = 0; i < chars.length; i++) {
            if(Character.isLowerCase(chars[i])){            //метод isLowerCase проверяет, что символ это буква и проверяет, что эта буква является в LowerCase
                chars[i] = Character.toUpperCase(chars[i]);
            }else if(Character.isUpperCase(chars[i])){
                chars[i] = Character.toLowerCase(chars[i]);
            }
        }
        return new String(chars);
    }
}
