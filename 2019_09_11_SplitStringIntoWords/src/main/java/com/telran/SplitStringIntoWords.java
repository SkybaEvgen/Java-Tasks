package com.telran;

import java.util.*;

public class SplitStringIntoWords {
    /*private Set vocabulary;
    public SplitStringIntoWords(Set vocabulary) {
        this.vocabulary = vocabulary;
    }*/

    public static void main(String[] args) {
        Set<String> collect = new HashSet<>();
        collect.addAll(Arrays.asList("asder", "set", "is", "an", "sdfgbn", "interface", "which", "extends", "collection", ""));

        String text = "setisaninterfacewhichextendscollection";

        System.out.println(splitStringIntoWords(text, collect));

    }

    public static List splitStringIntoWords (String text, Set collection){
        char[] chars = text.toCharArray();
        String tmp = "";
        List<String> list = new ArrayList<String>(collection);
        List<String> listReturn = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            tmp = tmp + chars[i];
            for (int j = 0; j < list.size(); j++) {
                if(tmp.length() == list.get(j).length() && tmp.equals(list.get(j))){
                    listReturn.add(tmp);
                    tmp = "";
                }
            }
        }
        return listReturn;
    }
}