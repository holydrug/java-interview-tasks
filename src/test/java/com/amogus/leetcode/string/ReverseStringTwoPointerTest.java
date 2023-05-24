package com.amogus.leetcode.string;

import com.amogus.leetcode.string.impl.pointers.two.ReverseStringTwoPointer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseStringTwoPointerTest {

    private ReverseStringTwoPointer underTest;

    @BeforeEach
    public void init() {
        underTest = new ReverseStringTwoPointer();
    }
    @Test
    void reverseString() {
        char[] input = new char[] {'h','e','l','l','o'};

        underTest.reverseString(input);
    }
}