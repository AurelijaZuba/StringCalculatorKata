package com.codurance;

import static org.junit.Assert.assertThat;

import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class StringCalculatorShould {

    @Test
    public void shouldReturnZero()
    {
        assertThat(StringCalculator.add(""), is(0));
    }

    @Test
    public void shouldReturnOne() {
        assertThat(StringCalculator.add("1"), is(1));
    }

    @Test
    public void shouldReturnAnyPassedNumber() {
        assertThat(StringCalculator.add("2"), is(2));
    }

    @Test
    public void shouldReturnThree() {
        assertThat(StringCalculator.add("1,2"), is(3));
    }
}
