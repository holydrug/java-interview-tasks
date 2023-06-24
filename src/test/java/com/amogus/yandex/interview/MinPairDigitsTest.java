package com.amogus.yandex.interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinPairDigitsTest {

    private MinPairDigits underTest;

    @BeforeEach
    void setUp() {
        underTest = new MinPairDigits();
    }

    @Test
    void minPairDigits1() {
        int[] input = new int[] {9, 4, 2, 5, 3};
        long output = 6;

        long result = underTest.minPairDigits(input);

        Assertions.assertEquals(output, result);
    }
    @Test
    void minPairDigits2() {
        int[] input = new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2};
        long output = Integer.MAX_VALUE * 2L;

        long result = underTest.minPairDigits(input);

        Assertions.assertEquals(output, result);
    }

    @Test
    void minPairDigits3() {
        int[] input = new int[] {-1, 2, -3};
        long output = -6;

        long result = underTest.minPairDigits(input);

        Assertions.assertEquals(output, result);
    }
}