package com.amogus.leetcode.string.impl.pointers.two;

import com.amogus.leetcode.string.tasks.ReverseString;

/**
 * 344. Reverse String
 * https://leetcode.com/problems/reverse-string/
 * ==
 * Write a function that reverses a string.
 * The input string is given as an array of characters s.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 * ==
 * Example 1:
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * ==
 * Example 2:
 * Input: s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 */
public class ReverseStringTwoPointer implements ReverseString {
    @Override
    public void reverseString(char[] s) {
        int lPointer = 0;
        int rPointer = s.length - 1;

        for (;lPointer < rPointer;) {
            char temp = s[rPointer];
            s[rPointer] = s[lPointer];
            s[lPointer] = temp;
            lPointer++;
            rPointer--;
        }
    }
}
