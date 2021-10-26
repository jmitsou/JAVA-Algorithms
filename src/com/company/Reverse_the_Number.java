package com.company;

public class Reverse_the_Number {
 //Create a function that takes an integer n and reverses it.

    public static void reverseNumber(int num){

        int reverseNum = 0;

        for( ;num != 0; num=num/10) {
            int remainder = num % 10;
            reverseNum = reverseNum * 10 + remainder;
        }
        System.out.println("The reverse number is: " + reverseNum);
    }
}

//Reverse the Number https://edabit.com/challenge/tiyPFonvAJ8e6H9jS
