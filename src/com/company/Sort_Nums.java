package com.company;

import java.util.Arrays;

public class Sort_Nums {

    public static void sortNumsAscending(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            Arrays.stream(nums).sorted();
        }
        System.out.println(Arrays.toString(nums));
    }
}