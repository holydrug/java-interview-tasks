package com.amogus.arrays;

import com.amogus.leetcode.arrays.impl.bruteforce.MaxConsecutiveOnesBruteForce;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaxConsecutiveOnesTest {
    private MaxConsecutiveOnesBruteForce maxConsecutiveOnesBruteForce;

    @BeforeEach
    public void init() {
        maxConsecutiveOnesBruteForce = new MaxConsecutiveOnesBruteForce();
    }

    @Test
    void findMaxConsecutiveOnes1() {
        int[] input = {1, 1, 0, 1, 1, 1};
        int output = 3;

        int result = maxConsecutiveOnesBruteForce.findMaxConsecutiveOnes(input);

        Assertions.assertEquals(output, result);
    }

    @Test
    void findMaxConsecutiveOnes2() {
        int[] input = {1,0,1,1,0,1};
        int output = 2;

        int result = maxConsecutiveOnesBruteForce.findMaxConsecutiveOnes(input);

        Assertions.assertEquals(output, result);
    }
}