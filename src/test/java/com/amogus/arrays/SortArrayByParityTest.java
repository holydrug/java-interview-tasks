package com.amogus.arrays;

import com.amogus.leetcode.arrays.impl.pointers.two.SortArrayByParityTwoPointers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SortArrayByParityTest {
    private SortArrayByParityTwoPointers underTest;

    @BeforeEach
    public void init() {
        underTest = new SortArrayByParityTwoPointers();
    }

    @Test
    void sortArrayByParity() {
        int[] input = new int[]{1, 0};
        int[] output = new int[]{0, 1};

        int[] result = underTest.sortArrayByParity(input);

        Assertions.assertTrue(Arrays.equals(output, result));
    }
}