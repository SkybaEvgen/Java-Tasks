package com.telran;

// aaabbcc -> a3b2c2

public class EncodeString {

    public String encode(String str){
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while ((i + 1) < str.length() && str.charAt(i) == str.charAt(i + 1)){
                count++;
                i++;
            }
            s = s + str.charAt(i) + count;
        }
        return s;
    }
}
