package com.company;

import com.company.warmup_10_26.How_Many_Vowels;
import com.company.warmup_10_26.Reverse_the_Number;
import com.company.warmup_10_26.Video_Length;
import com.company.warmup_10_28.Difference_of_Max_an_Min;
import com.company.warmup_10_28.Double_Letters;
import com.company.warmup_10_28.Sort_Nums;
import com.company.warmup_11_1.Array_of_Multiples;
import com.company.warmup_11_1.Janken;
import com.company.warmup_11_15.ClassCode_WarmUp;
import com.company.warmup_11_15.Number_of_Boomerangs;
import com.company.warmup_11_22.NumOfDigitsInNum;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] test = {1, 2, 10, 50, 5};
        int[] boomTest = {9, 5, 9, 5, 1, 1, 1};

        How_Many_Vowels.vowelCount("tutorial");
        Reverse_the_Number.reverseNumber(5678);
        Video_Length.minutesToSeconds("12:45");
        Sort_Nums.sortNumsAscending(test);
        Janken.rps("jan","po");
        Array_of_Multiples.arrayOfMultiples(5,10);
        Difference_of_Max_an_Min.differenceMaxMin(test);
        Double_Letters.double_Again("Jeff");
        ClassCode_WarmUp.getCount("Odin");
        Number_of_Boomerangs.countBoomerangs(boomTest);
        NumOfDigitsInNum.numOfDigits(888888885);
    }
}
