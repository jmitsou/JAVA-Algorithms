package com.company.warmup_11_1;

public class Janken {

    public static void rps(String s1, String s2) {

        if (s1 == "jan" && s2 == "po" || s1 == "ken" && s2 == "jan"){
            System.out.println("Player 1 is the winner");
        }else if (s2 == "jan" && s1 == "po" || s2 == "ken" && s1 == "jan"){
            System.out.println("Player 2 is the winner");
        }else if (s1 == "jan" && s2 == "jan" || s1 == "ken" && s2 == "ken" || s1 == "po" && s2 == "po"){
            System.out.println("Its a TIE");
        }
    }
}

//https://jet.fandom.com/wiki/Janken - Japanese Rock, Paper, Scissor
//Rock, Paper, Scissors https://edabit.com/challenge/3S8XppR6Yf5mXPxij
