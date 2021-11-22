package com.company.warmup_11_15;

public class ClassCode_WarmUp {

    public static int getCount(String str) {
        int vowelsCount = 0;

        char[] charArray = str.toLowerCase().toCharArray();

        for (int i = 0; i < charArray.length; i++) {

            if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o' || charArray[i] == 'u'){
                vowelsCount++;
            }

        }
        System.out.println("There are " + vowelsCount + " in this word");
        return vowelsCount;
    }
}
