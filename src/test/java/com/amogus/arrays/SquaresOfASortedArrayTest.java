package com.amogus.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SquaresOfASortedArrayTest {
    @Test
    void calculateShouldReturnCorrectOutput1() {
        int[] input = {-4, -1, 0, 3, 10};
        int[] output = {0, 1, 9, 16, 100};

        int[] result = SquaresOfASortedArray.calculate(input);

        Assertions.assertTrue(Arrays.equals(output, result));
    }

    @Test
    void calculateShouldReturnCorrectOutput2() {
        int[] input = {-7,-3,2,3,11};
        int[] output = {4,9,9,49,121};

        int[] result = SquaresOfASortedArray.calculate(input);

        Assertions.assertTrue(Arrays.equals(output, result));
    }
}