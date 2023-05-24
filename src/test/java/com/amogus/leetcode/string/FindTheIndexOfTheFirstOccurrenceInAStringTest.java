package com.amogus.leetcode.string;

import com.amogus.leetcode.string.impl.pointers.two.FindTheIndexOfTheFirstOccurrenceInAStringKMP;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FindTheIndexOfTheFirstOccurrenceInAStringTest {

    private FindTheIndexOfTheFirstOccurrenceInAStringKMP underTest;

    @BeforeEach
    public void init() {
        underTest = new FindTheIndexOfTheFirstOccurrenceInAStringKMP();
    }

    @Test
    void strStr1() {
        String haystack = "sadbutsad";
        String needle = "sad";
        int output = 0;

        int result = underTest.strStr(haystack, needle);

        Assertions.assertEquals(output, result);
    }

    @Test
    void strStr2() {
        String haystack = "abcabeabcabcabd";
        String needle = "abcabd";
        int output = 9;

        int result = underTest.strStr(haystack, needle);

        Assertions.assertEquals(output, result);
    }

    @Test
    void prefixFunc() {
        String input = "abcabd";
        int[] output = new int[] {0, 0, 0, 1, 2, 0};

        int[] result = underTest.prefixFunc(input);

        Assertions.assertArrayEquals(output, result);
    }
}