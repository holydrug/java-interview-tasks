package com.amogus.leetcode.arrays.impl.sliding.window;

import com.amogus.leetcode.arrays.tasks.MaxConsecutiveOnesII;

/**
 * 487. Max Consecutive Ones II
 * https://leetcode.com/problems/max-consecutive-ones-ii/
 * ==
 * Given a binary array nums,
 * return the maximum number of consecutive 1's in the array if you can flip at most one 0.
 * ==
 * Example 1:
 * Input: nums = [1,0,1,1,0]
 * Output: 4
 * Explanation:
 * - If we flip the first zero, nums becomes [1,1,1,1,0] and we have 4 consecutive ones.
 * - If we flip the second zero, nums becomes [1,0,1,1,1] and we have 3 consecutive ones.
 * The max number of consecutive ones is 4.
 * ==
 * Example 2:
 * Input: nums = [1,0,1,1,0,1]
 * Output: 4
 * Explanation:
 * - If we flip the first zero, nums becomes [1,1,1,1,0,1] and we have 4 consecutive ones.
 * - If we flip the second zero, nums becomes [1,0,1,1,1,1] and we have 4 consecutive ones.
 * The max number of consecutive ones is 4.
 */
public class MaxConsecutiveOnesIISlidingWindow implements MaxConsecutiveOnesII {
    @Override
    public int findMaxConsecutiveOnes(int[] nums) {
        int leftPointer = 0;
        int rightPointer = 0;
        int numberOfZeros = 0;
        int maxValue = 0;

        while (rightPointer < nums.length) {
            if (nums[rightPointer] == 0) {
                numberOfZeros++;
            }

            while (numberOfZeros == 2) {
                if (nums[leftPointer] == 0) {
                    numberOfZeros--;
                }
                leftPointer++;
            }

            maxValue = Math.max(maxValue, rightPointer - leftPointer + 1);
            rightPointer++;
        }

        return maxValue;
    }
}
