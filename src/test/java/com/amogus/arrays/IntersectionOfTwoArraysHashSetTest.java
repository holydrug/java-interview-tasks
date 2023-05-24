package com.amogus.arrays;

import com.amogus.leetcode.arrays.impl.hash.set.IntersectionOfTwoArraysHashSet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntersectionOfTwoArraysHashSetTest {

    private IntersectionOfTwoArraysHashSet underTest;

    @BeforeEach
    public void init() {
        underTest = new IntersectionOfTwoArraysHashSet();
    }
    @Test
    void intersection1() {
        int[] firstInput = new int[] {1,2,2,1};
        int[] secondInput = new int[] {2,2};
        int[] output = new int[] {2};

        int[] result = underTest.intersection(firstInput, secondInput);

        Assertions.assertArrayEquals(output, result);
    }

    @Test
    void intersection2() {
        int[] firstInput = new int[] {4,9,5};
        int[] secondInput = new int[] {9,4,9,8,4};
        int[] output = new int[] {4,9};

        int[] result = underTest.intersection(firstInput, secondInput);

        Assertions.assertArrayEquals(output, result);
    }
}