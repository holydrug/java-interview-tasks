package com.amogus.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HeightCheckerTest {
    private HeightChecker underTest;

    @BeforeEach
    public void init() {
        underTest = new HeightChecker();
    }

    @Test
    void heightChecker() {
        int[] input = new int[]{5, 1, 2, 3, 4};
        int output = 5;

        int result = underTest.heightChecker(input);

        Assertions.assertEquals(output, result);
    }
}