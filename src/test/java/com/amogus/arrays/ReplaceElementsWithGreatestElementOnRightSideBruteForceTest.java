package com.amogus.arrays;

import com.amogus.leetcode.arrays.impl.bruteforce.ReplaceElementsWithGreatestElementOnRightSideBruteForce;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ReplaceElementsWithGreatestElementOnRightSideBruteForceTest {

    private ReplaceElementsWithGreatestElementOnRightSideBruteForce underTest;

    @BeforeEach
    public void init() {
        underTest = new ReplaceElementsWithGreatestElementOnRightSideBruteForce();
    }

    @Test
    void replaceElements() {
        int[] input = new int[]{17, 18, 5, 4, 6, 1};
        int[] output = new int[]{18, 6, 6, 6, 1, -1};

        int[] result = underTest.replaceElements(input);

        Assertions.assertTrue(Arrays.equals(output, result));
    }
}