package com.amogus.arrays;

import com.amogus.leetcode.arrays.impl.pointers.two.MoveZeroesTwoPointers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MoveZeroesTwoPointersTest {

    private MoveZeroesTwoPointers underTest;

    @BeforeEach
    public void init() {
        underTest = new MoveZeroesTwoPointers();
    }

    @Test
    void moveZeroes() {
        int[] input = new int[]{0, 1, 0, 3, 12};

        underTest.moveZeroes(input);
    }
}