package com.amogus.leetcode.arrays.impl.sliding.window;

import com.amogus.leetcode.arrays.tasks.MinimumSizeSubarraySum;

/**
 * 209. Minimum Size Subarray Sum
 * https://leetcode.com/problems/minimum-size-subarray-sum/
 * ==
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray
 * whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 * ==
 * Example 1:
 * Input: target = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 * ==
 * Example 2:
 * Input: target = 4, nums = [1,4,4]
 * Output: 1
 * ==
 * Example 3:
 * Input: target = 11, nums = [1,1,1,1,1,1,1,1]
 * Output: 0
 */
public class MinimumSizeSubarraySumImpl implements MinimumSizeSubarraySum {

    @Override
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int currentWindow = 0;

        for(int i = 0, j = 0; i < nums.length; i++) {
            currentWindow += nums[i];

            while (currentWindow >= target) {
                result = Math.min(result, i - j + 1);
                currentWindow -= nums[j];
                j++;
            }
        }
        return result != Integer.MAX_VALUE ? result : 0;
    }
}
