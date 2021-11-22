package com.company.warmup_10_28;

import java.util.Arrays;

public class Difference_of_Max_an_Min {

    public static int differenceMaxMin(int[] arr) {
        int difference = 0;
        Arrays.sort(arr);
        int small = arr[0];
        int large = arr[arr.length - 1];

        difference = large - small;
        System.out.println("The difference is " + difference);
        return difference;
    }
}
