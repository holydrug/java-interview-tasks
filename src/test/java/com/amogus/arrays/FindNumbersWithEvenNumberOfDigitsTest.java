package com.amogus.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNumbersWithEvenNumberOfDigitsTest {

    @Test
    void findNumbers1() {
        int[] input = {12, 345, 2, 6, 7896};
        int output = 2;

        int result = FindNumbersWithEvenNumberOfDigits.findNumbers(input);

        Assertions.assertEquals(output, result);
    }

    @Test
    void findNumbers2() {
        int[] input = {555,901,482,1771};
        int output = 1;

        int result = FindNumbersWithEvenNumberOfDigits.findNumbers(input);

        Assertions.assertEquals(output, result);
    }
}