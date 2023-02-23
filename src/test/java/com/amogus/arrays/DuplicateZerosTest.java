package com.amogus.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class DuplicateZerosTest {

    @Test
    void modifyArray1() {
        int[] input = {1, 0, 2, 3, 0, 4, 5, 0};
        int[] output = {1, 0, 0, 2, 3, 0, 0, 4};

        int[] result = DuplicateZeros.modifyArray(input);

        Assertions.assertTrue(Arrays.equals(output, result));
    }

    @Test
    void modifyArray2() {
        int[] input = {1,2,3};
        int[] output = {1,2,3};

        int[] result = DuplicateZeros.modifyArray(input);

        Assertions.assertTrue(Arrays.equals(output, result));
    }
}