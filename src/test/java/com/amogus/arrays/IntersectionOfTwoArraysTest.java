package com.amogus.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoArraysTest {

    private IntersectionOfTwoArrays underTest;

    @BeforeEach
    public void init() {
        underTest = new IntersectionOfTwoArrays();
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