package com.codurance;

public class StringCalculator
{
    public static int add( String numbers) {
        if(numbers == "") return 0;
        return Integer.parseInt(numbers);
    }
}
