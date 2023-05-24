package com.amogus.arrays;

import com.amogus.leetcode.arrays.impl.sorting.LargestNumberAtLeastTwiceOfOthersSorting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LargestNumberAtLeastTwiceOfOthersSortingTest {

    private LargestNumberAtLeastTwiceOfOthersSorting underTest;

    @BeforeEach
    public void init() {
        underTest = new LargestNumberAtLeastTwiceOfOthersSorting();
    }

    @Test
    void dominantIndex() {
        int[] input = new int[]{0,0,0,1};
        int output = 3;

        int result = underTest.dominantIndex(input);

        Assertions.assertEquals(output, result);
    }
}