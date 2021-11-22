package com.company.warmup_10_26;

import java.util.Objects;

public class How_Many_Vowels {

    //Create a function that takes a string and returns the number (count) of vowels contained within it.

    String vowel;

    public static void vowelCount(String vowel){

        String[] strArr = vowel.split("");
        int numOfVowels = 0;
        for (String s : strArr) {
            if (Objects.equals(s, "a") || Objects.equals(s, "e") || Objects.equals(s, "i") || Objects.equals(s, "o") || Objects.equals(s, "u")) {
                numOfVowels++;
            }
        }

        System.out.println("There are " + numOfVowels+ " in " + vowel);
    }
}

//How Many Vowels?  https://edabit.com/challenge/GBKphScsmDi9ek3ra
