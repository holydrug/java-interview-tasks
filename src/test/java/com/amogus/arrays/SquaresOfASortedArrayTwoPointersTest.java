package com.amogus.arrays;

import com.amogus.leetcode.arrays.impl.pointers.two.SquaresOfASortedArrayTwoPointers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SquaresOfASortedArrayTwoPointersTest {
    private SquaresOfASortedArrayTwoPointers squaresOfASortedArrayTwoPointers;

    @BeforeEach
    public void init() {
        squaresOfASortedArrayTwoPointers = new SquaresOfASortedArrayTwoPointers();
    }

    @Test
    void calculateShouldReturnCorrectOutput1() {
        int[] input = {-4, -1, 0, 3, 10};
        int[] output = {0, 1, 9, 16, 100};

        int[] result = squaresOfASortedArrayTwoPointers.sortedSquares(input);

        Assertions.assertTrue(Arrays.equals(output, result));
    }

    @Test
    void calculateShouldReturnCorrectOutput2() {
        int[] input = {-7, -3, 2, 3, 11};
        int[] output = {4, 9, 9, 49, 121};

        int[] result = squaresOfASortedArrayTwoPointers.sortedSquares(input);

        Assertions.assertTrue(Arrays.equals(output, result));
    }
}