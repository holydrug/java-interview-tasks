package com.amogus.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidMountainArrayTest {

    private ValidMountainArray validMountainArray;

    @BeforeEach
    public void init() {
        validMountainArray = new ValidMountainArray();
    }

    @Test
    void validMountainArray() {
        int[] input = new int[]{0, 3, 2, 1};
        boolean output = true;

        boolean result = validMountainArray.validMountainArray(input);

        Assertions.assertEquals(result, output);
    }

}