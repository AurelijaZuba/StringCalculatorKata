package com.codurance;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator
{
    public static int add(String numbers) {
        String[] splitNumbers = numbers.split(",");

        if(numbers == "") return 0;

        List<Integer> storedNumbers = new ArrayList<>();
       for(int i = 0; i < splitNumbers.length; i++)
        {
            storedNumbers.add(Integer.parseInt(splitNumbers[i]));
        }
       int sumNumber = 0;
        for(int i = 0; i < storedNumbers.size(); i++)
        {
            sumNumber += storedNumbers[i];
        }

        return Integer.parseInt(numbers);
        //return storedNumbers;
    }
}
