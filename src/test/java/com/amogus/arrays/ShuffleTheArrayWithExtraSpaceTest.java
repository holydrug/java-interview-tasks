package com.amogus.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShuffleTheArrayWithExtraSpaceTest {

    private ShuffleTheArrayWithExtraSpace underTest;

    @BeforeEach
    public void init() {
        underTest = new ShuffleTheArrayWithExtraSpace();
    }

    @Test
    void shuffle() {
        int[] inputArray = new int[]{2, 5, 1, 3, 4, 7};
        int inputVar = 3;
        int[] output = new int[]{2, 3, 5, 4, 1, 7};

        int[] result = underTest.shuffle(inputArray, inputVar);

        Assertions.assertArrayEquals(output, result);
    }
}