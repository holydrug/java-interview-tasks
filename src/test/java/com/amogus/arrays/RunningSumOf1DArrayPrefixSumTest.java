package com.amogus.arrays;

import com.amogus.leetcode.arrays.impl.prefix.sum.RunningSumOf1dArrayPrefixSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RunningSumOf1DArrayPrefixSumTest {

    private RunningSumOf1dArrayPrefixSum underTest;

    @BeforeEach
    public void init() {
        underTest = new RunningSumOf1dArrayPrefixSum();
    }

    @Test
    void runningSum1() {
        int[] input = new int[]{1, 2, 3, 4};
        int[] output = new int[]{1, 3, 6, 10};

        int[] result = underTest.runningSum(input);

        Assertions.assertArrayEquals(output, result);
    }

    @Test
    void runningSum2() {
        int[] input = new int[]{1,1,1,1,1};
        int[] output = new int[]{1,2,3,4,5};

        int[] result = underTest.runningSum(input);

        Assertions.assertArrayEquals(output, result);
    }
}