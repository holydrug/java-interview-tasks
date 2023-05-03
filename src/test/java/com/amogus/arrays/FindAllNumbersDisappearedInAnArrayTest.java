package com.amogus.arrays;

import com.amogus.leetcode.arrays.FindAllNumbersDisappearedInAnArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class FindAllNumbersDisappearedInAnArrayTest {

    private FindAllNumbersDisappearedInAnArray underTest;

    @BeforeEach
    public void init() {
        underTest = new FindAllNumbersDisappearedInAnArray();
    }

    @Test
    void findDisappearedNumbers1() {
        int[] input = new int[]{1, 1};
        int[] output = new int[]{2};

        List<Integer> result = underTest.findDisappearedNumbers(input);

        Assertions.assertArrayEquals(output, result.stream().mapToInt(Integer::intValue).toArray());
    }

    @Test
    void findDisappearedNumbers2() {
        int[] input = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        int[] output = new int[]{5, 6};

        List<Integer> result = underTest.findDisappearedNumbers(input);

        Assertions.assertArrayEquals(output, result.stream().mapToInt(Integer::intValue).toArray());
    }
}