package com.amogus.leetcode.arrays;

import com.amogus.leetcode.arrays.impl.sorting.ArrayPartitionSorting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayPartitionSortingTest {

    private ArrayPartitionSorting underTest;

    @BeforeEach
    public void init() {
        underTest = new ArrayPartitionSorting();
    }

    @Test
    void arrayPairSum1() {
        int[] input = new int[]{1, 4, 3, 2};
        int output = 4;

        int result = underTest.arrayPairSum(input);

        Assertions.assertEquals(output, result);
    }

    @Test
    void arrayPairSum2() {
        int[] input = new int[]{6, 2, 6, 5, 1, 2};
        int output = 9;

        int result = underTest.arrayPairSum(input);

        Assertions.assertEquals(output, result);
    }
}