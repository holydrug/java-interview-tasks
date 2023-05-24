package com.amogus.arrays;

import com.amogus.leetcode.arrays.impl.queue.DuplicateZerosQueue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DuplicateZerosQueueTest {

    private DuplicateZerosQueue underTest;

    @BeforeEach
    public void init() {
        underTest = new DuplicateZerosQueue();
    }

    @Test
    void modifyArray1() {
        int[] input = {1, 0, 2, 3, 0, 4, 5, 0};
        int[] output = {1, 0, 0, 2, 3, 0, 0, 4};

        int[] result = underTest.modifyArray(input);

        Assertions.assertArrayEquals(output, result);
    }

    @Test
    void modifyArray2() {
        int[] input = {1,2,3};
        int[] output = {1,2,3};

        int[] result = underTest.modifyArray(input);

        Assertions.assertArrayEquals(output, result);
    }
}