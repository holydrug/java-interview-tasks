package com.amogus.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxConsecutiveOnesTest {

    @Test
    void findMaxConsecutiveOnes1() {
        int[] input = {1, 1, 0, 1, 1, 1};
        int output = 3;

        int result = MaxConsecutiveOnes.findMaxConsecutiveOnes(input);

        Assertions.assertEquals(output, result);
    }

    @Test
    void findMaxConsecutiveOnes2() {
        int[] input = {1,0,1,1,0,1};
        int output = 2;

        int result = MaxConsecutiveOnes.findMaxConsecutiveOnes(input);

        Assertions.assertEquals(output, result);
    }
}