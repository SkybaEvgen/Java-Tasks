package com.telran;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagramma {

    public boolean anagrammaTwoWords(String text1, String text2){
        if(text1.length() == text2.length()){
            String text1toLowerCase = text1.toLowerCase();
            String text2toLowerCase = text2.toLowerCase();
            List<String> word1 = new ArrayList<>(Arrays.asList(text1toLowerCase.split("")));
            List<String> word2 = new ArrayList<>(Arrays.asList(text2toLowerCase.split("")));
            Collections.sort(word1);
            Collections.sort(word2);
            if(word1.equals(word2)) return true;
            else return false;
        }else return false;
    }
}
