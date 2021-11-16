package com.company;

public class Number_of_Boomerangs {
    
    public static int countBoomerangs(int[] arr) {
        int boomCount = 0;

        for (int i = 1; i < arr.length -2; i++) {
            if (arr[i-1] == arr[i+1] && arr[i] != arr[i-1] ) {
                boomCount++;
            }
        }
        System.out.println("There are " + boomCount + " boomerangs");
        return boomCount;
    }
}
//Number of Boomerangs
//https://edabit.com/challenge/WzE2id9w5mNfXozKL
