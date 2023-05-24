package com.amogus.leetcode.arrays.sliding.window;

import com.amogus.leetcode.arrays.impl.sliding.window.SlidingWindowMaximumDeque;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SlidingWindowMaximumDequeTest {

    private SlidingWindowMaximumDeque underTest;

    @BeforeEach
    void init() {
        underTest = new SlidingWindowMaximumDeque();
    }

    @Test
    void maxSlidingWindow1() {
        int[] input = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] output = new int[]{3, 3, 5, 5, 6, 7};

        int[] result = underTest.maxSlidingWindow(input, k);

        Assertions.assertArrayEquals(output, result);
    }

    @Test
    void maxSlidingWindow2() {
        int[] input = new int[]{1};
        int k = 1;
        int[] output = new int[]{1};

        int[] result = underTest.maxSlidingWindow(input, k);

        Assertions.assertArrayEquals(output, result);
    }
}