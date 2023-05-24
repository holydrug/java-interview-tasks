package com.amogus.leetcode.arrays;

import com.amogus.leetcode.arrays.impl.bruteforce.PlusOneBruteForce;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlusOneBruteForceTest {

    private PlusOneBruteForce underTest;

    @BeforeEach
    public void init() {
        underTest = new PlusOneBruteForce();
    }

    @Test
    void plusOne1() {
        int[] input = new int[]{1, 2, 3};
        int[] output = new int[]{1, 2, 4};

        int[] result = underTest.plusOne(input);

        Assertions.assertArrayEquals(output, result);
    }

    @Test
    void plusOne2() {
        int[] input = new int[]{4, 3, 2, 9};
        int[] output = new int[]{4, 3, 3, 0};

        int[] result = underTest.plusOne(input);

        Assertions.assertArrayEquals(output, result);
    }

    @Test
    void plusOne3() {
        int[] input = new int[]{9, 9};
        int[] output = new int[]{1, 0, 0};

        int[] result = underTest.plusOne(input);

        Assertions.assertArrayEquals(output, result);
    }
}