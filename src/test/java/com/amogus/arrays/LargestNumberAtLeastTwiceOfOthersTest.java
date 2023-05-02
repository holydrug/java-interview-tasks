package com.amogus.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestNumberAtLeastTwiceOfOthersTest {

    private LargestNumberAtLeastTwiceOfOthers underTest;

    @BeforeEach
    public void init() {
        underTest = new LargestNumberAtLeastTwiceOfOthers();
    }

    @Test
    void dominantIndex() {
        int[] input = new int[]{0,0,0,1};
        int output = 3;

        int result = underTest.dominantIndex(input);

        Assertions.assertEquals(output, result);
    }
}