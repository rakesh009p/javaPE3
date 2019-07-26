package com.stackroute.pe3;

public class RemoveVowels {
    public String[] vowelRemover(String[] string){
        String[] strings=new String[string.length];
        for(int i=0;i<string.length;i++){
            strings[i] =string[i].replaceAll("[aeiou]", "");
        }
        return strings;


    }
}
