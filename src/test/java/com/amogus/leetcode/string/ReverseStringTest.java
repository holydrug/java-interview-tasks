package com.amogus.leetcode.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    private ReverseString underTest;

    @BeforeEach
    public void init() {
        underTest = new ReverseString();
    }
    @Test
    void reverseString() {
        char[] input = new char[] {'h','e','l','l','o'};

        underTest.reverseString(input);
    }
}