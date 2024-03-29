package com.amogus.leetcode.arrays.impl.bruteforce;

import com.amogus.leetcode.arrays.tasks.FindNumbersWithEvenNumberOfDigits;

/**
 * 1295. Find Numbers with Even Number of Digits
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 * ==
 * Given an array nums of integers, return how many of them contain an even number of digits.
 * ==
 * Example 1:
 * Input: nums = [12,345,2,6,7896]
 * Output: 2
 * Explanation:
 * 12 contains 2 digits (even number of digits).
 * 345 contains 3 digits (odd number of digits).
 * 2 contains 1 digit (odd number of digits).
 * 6 contains 1 digit (odd number of digits).
 * 7896 contains 4 digits (even number of digits).
 * Therefore only 12 and 7896 contain an even number of digits.
 * ==
 * Example 2:
 * Input: nums = [555,901,482,1771]
 * Output: 1
 * Explanation:
 * Only 1771 contains an even number of digits.
 */
public class FindNumbersWithEvenNumberOfDigitsBruteForce implements FindNumbersWithEvenNumberOfDigits {
    @Override
    public int findNumbers(int[] nums) {
        int evenCounter = 0;

        for (int i = 0; i < nums.length; i++) {
            int delimeter = 10;
            int countOfDelimeters = 0;

            while (nums[i] / delimeter != 0) {
                delimeter = delimeter * 10;
                countOfDelimeters++;
            }

            if (countOfDelimeters % 2 == 1) {
                evenCounter++;
            }
        }

        return evenCounter;
    }
}
