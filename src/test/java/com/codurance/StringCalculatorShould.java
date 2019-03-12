package com.codurance;

import static org.junit.Assert.assertThat;

import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class StringCalculatorShould
{

    @Test
    public void shouldReturnZero()
    {
        assertThat(StringCalculator.add(""), is(0));
    }

}
