package com.amogus.arrays;

import com.amogus.leetcode.arrays.impl.sliding.window.MaxConsecutiveOnesIISlidingWindow;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaxConsecutiveOnesBruteForceIISlidingWindowTest {

    private MaxConsecutiveOnesIISlidingWindow underTest;

    @BeforeEach
    public void init() {
        underTest = new MaxConsecutiveOnesIISlidingWindow();
    }

    @Test
    void findMaxConsecutiveOnes() {
        int[] input = new int[]{1, 0, 1, 1, 0, 1};
        int output = 4;

        int result = underTest.findMaxConsecutiveOnes(input);

        Assertions.assertEquals(output, result);
    }
}