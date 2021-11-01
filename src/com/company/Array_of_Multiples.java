package com.company;

import java.util.Arrays;

public class Array_of_Multiples {

    public static int[] arrayOfMultiples(int num, int length) {
        int numMulti[] = new int[length];

        for (int i = 1; i < length; i++) {

            numMulti[i] = num * i;
            
        }
        System.out.println(Arrays.toString(numMulti));

        return numMulti;



    }


}
