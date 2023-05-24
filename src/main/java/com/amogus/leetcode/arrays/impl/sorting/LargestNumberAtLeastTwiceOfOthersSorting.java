package com.amogus.leetcode.arrays.impl.sorting;

import com.amogus.leetcode.arrays.tasks.LargestNumberAtLeastTwiceOfOthers;

/**
 * 747. Largest Number At Least Twice of Others
 * https://leetcode.com/problems/largest-number-at-least-twice-of-others/
 * ==
 * You are given an integer array nums where the largest integer is unique.
 * Determine whether the largest element in the array
 * is at least twice as much as every other number in the array.
 * If it is, return the index of the largest element, or return -1 otherwise.
 * ==
 * Example 1:
 * Input: nums = [3,6,1,0]
 * Output: 1
 * Explanation: 6 is the largest integer.
 * For every other number in the array x, 6 is at least twice as big as x.
 * The index of value 6 is 1, so we return 1.
 * ==
 * Example 2:
 * Input: nums = [1,2,3,4]
 * Output: -1
 * Explanation: 4 is less than twice the value of 3, so we return -1.
 */
public class LargestNumberAtLeastTwiceOfOthersSorting implements LargestNumberAtLeastTwiceOfOthers {
    @Override
    public int dominantIndex(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return -1;
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int maxIndex = -1;

        int idx = 0;
        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
                maxIndex = idx;
            } else if (num > max2) {
                max2 = num;
            }
            idx++;
        }

        if (max1 >= max2 * 2) {
            return maxIndex;
        } else {
            return -1;
        }
    }
}
