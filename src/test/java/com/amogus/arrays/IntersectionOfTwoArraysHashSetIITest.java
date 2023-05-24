package com.amogus.arrays;

import com.amogus.leetcode.arrays.impl.pointers.two.IntersectionOfTwoArraysIITwoPointers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntersectionOfTwoArraysHashSetIITest {

    private IntersectionOfTwoArraysIITwoPointers underTest;

    @BeforeEach
    public void init() {
        underTest = new IntersectionOfTwoArraysIITwoPointers();
    }

    @Test
    void intersection1() {
        int[] firstInput = new int[]{1, 2, 2, 1};
        int[] secondInput = new int[]{2};
        int[] output = new int[]{2};

        int[] result = underTest.intersect(firstInput, secondInput);

        Assertions.assertArrayEquals(output, result);
    }

    @Test
    void intersection2() {
        int[] firstInput = new int[]{4, 9, 5};
        int[] secondInput = new int[]{9, 4, 9, 8, 4};
        int[] output = new int[]{9, 4};

        int[] result = underTest.intersect(firstInput, secondInput);

        Assertions.assertArrayEquals(output, result);
    }
}