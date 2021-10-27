package com.company;

public class Video_Length {

    public static void minutesToSeconds(String tm) {

        String[] strArr = tm.split(":");
        int[] numArr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }

        int inSeconds = (numArr[0] * 60) + numArr[1];

        System.out.println("There are " + inSeconds + " seconds in " + tm);

    }

}

//Video Length https://edabit.com/challenge/9D39q2q9yAFCDM9da