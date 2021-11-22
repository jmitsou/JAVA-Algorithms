package com.company.warmup_10_28;

import java.util.Arrays;

public class Double_Letters {

    public static boolean double_Again(String word){
        boolean isTwo = false;

        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == word.charAt(i+1)){
                isTwo = true;
                break;
            }
        }

        return isTwo;
    }


}
