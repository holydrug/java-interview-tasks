package com.amogus.leetcode.arrays.impl.sliding.window;

import com.amogus.leetcode.arrays.tasks.MaximumAverageSubarrayI;

/**
 * 643. Maximum Average Subarray I
 * https://leetcode.com/problems/maximum-average-subarray-i/description/
 * ==
 * You are given an integer array nums consisting of n elements, and an integer k.
 * Find a contiguous subarray whose length
 * is equal to k that has the maximum average value and return this value.
 * Any answer with a calculation error less than 10-5 will be accepted.
 * ==
 * Example 1:
 * Input: nums = [1,12,-5,-6,50,3], k = 4
 * Output: 12.75000
 * Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
 * ==
 * Example 2:
 * Input: nums = [5], k = 1
 * Output: 5.00000
 */
public class MaximumAverageSubarrayISlidingWindow implements MaximumAverageSubarrayI {
    @Override
    public double findMaxAverage(int[] nums, int k) {
        int sumOfWindow = 0;
        for (int i = 0; i < k; i++) {
            sumOfWindow += nums[i];
        }

        double maxAvg = (double) sumOfWindow / k;

        for (int i = k; i < nums.length; i++) {
            sumOfWindow += nums[i] - nums[i - k];
            double mayMaxAvg = (double) sumOfWindow / k;
            maxAvg = Math.max(maxAvg, mayMaxAvg);
        }
        return maxAvg;
    }

}
