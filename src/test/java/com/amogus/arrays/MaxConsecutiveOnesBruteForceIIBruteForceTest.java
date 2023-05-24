package com.amogus.arrays;

import com.amogus.leetcode.arrays.impl.bruteforce.MaxConsecutiveOnesIIBruteForce;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaxConsecutiveOnesBruteForceIIBruteForceTest {

    private MaxConsecutiveOnesIIBruteForce underTest;

    @BeforeEach
    public void init() {
        underTest = new MaxConsecutiveOnesIIBruteForce();
    }

    @Test
    void findMaxConsecutiveOnes() {
        int[] input = new int[]{1, 0, 1, 1, 0, 1};
        int output = 4;

        int result = underTest.findMaxConsecutiveOnes(input);

        Assertions.assertEquals(output, result);
    }
}