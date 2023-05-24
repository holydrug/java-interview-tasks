package com.amogus.arrays;

import com.amogus.leetcode.arrays.impl.pointers.two.ValidMountainArrayTwoPointer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidMountainArrayTwoPointerTest {

    private ValidMountainArrayTwoPointer validMountainArrayTwoPointer;

    @BeforeEach
    public void init() {
        validMountainArrayTwoPointer = new ValidMountainArrayTwoPointer();
    }

    @Test
    void validMountainArray() {
        int[] input = new int[]{0, 3, 2, 1};
        boolean output = true;

        boolean result = validMountainArrayTwoPointer.validMountainArray(input);

        Assertions.assertEquals(result, output);
    }

}