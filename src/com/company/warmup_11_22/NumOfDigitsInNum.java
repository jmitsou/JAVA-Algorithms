package com.company.warmup_11_22;

public class NumOfDigitsInNum {

    public static int numOfDigits(int num) {
        //converts int num to a String
        String digitCount = Integer.toString(num);

        System.out.println("There are " + digitCount.length() + " digits in this number");
        //returns length of the new string
        return digitCount.length();
    }
}

//Find Number of Digits in Number
//https://edabit.com/challenge/z9ofdqhTYi9tdCj5T