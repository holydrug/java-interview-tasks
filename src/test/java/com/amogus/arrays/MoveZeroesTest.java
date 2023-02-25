package com.amogus.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MoveZeroesTest {

    private MoveZeroes underTest;

    @BeforeEach
    public void init() {
        underTest = new MoveZeroes();
    }

    @Test
    void moveZeroes() {
        int[] input = new int[]{0, 1, 0, 3, 12};

        underTest.moveZeroes(input);
    }
}