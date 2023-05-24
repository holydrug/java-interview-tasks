package com.amogus.leetcode.arrays.sliding.window;

import com.amogus.leetcode.arrays.impl.sliding.window.MinimumSizeSubarraySumImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MinimumSizeSubarraySumImplTest {

    private MinimumSizeSubarraySumImpl underTest;

    @BeforeEach
    public void init() {
        underTest = new MinimumSizeSubarraySumImpl();
    }

    @Test
    void minSubArrayLen1() {
        int[] input = new int[]{2, 3, 1, 2, 4, 3};
        int target = 7;
        int output = 2;

        int result = underTest.minSubArrayLen(target, input);

        Assertions.assertEquals(output, result);
    }

    @Test
    void minSubArrayLen2() {
        int[] input = new int[]{1, 4, 4};
        int target = 4;
        int output = 1;

        int result = underTest.minSubArrayLen(target, input);

        Assertions.assertEquals(output, result);
    }

    @Test
    void minSubArrayLen3() {
        int[] input = new int[]{11, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int target = 11;
        int output = 1;

        int result = underTest.minSubArrayLen(target, input);

        Assertions.assertEquals(output, result);
    }

}