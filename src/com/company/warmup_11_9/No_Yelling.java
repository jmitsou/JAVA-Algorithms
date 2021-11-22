package com.company.warmup_11_9;

public class No_Yelling {

    public static String noYelling(String phrase) {

        for(int i = phrase.length()-1; i >= 0 ; i--){
            if(Character.isLetter(phrase.charAt(i)))
                return phrase.substring(0, i+2);
        }
        return "";
    }
}
