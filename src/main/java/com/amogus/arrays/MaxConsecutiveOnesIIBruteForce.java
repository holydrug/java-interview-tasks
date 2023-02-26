package com.amogus.arrays;

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
public class MaxConsecutiveOnesIIBruteForce {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxValue = 0;

        for (int leftPointer = 0; leftPointer < nums.length; leftPointer++) {
            int numberOfZeros = 0;
            for (int rigthPointer = leftPointer; rigthPointer < nums.length; rigthPointer++) {
                if (nums[rigthPointer] == 0) {
                    numberOfZeros++;
                }
                if (numberOfZeros <= 1) {
                    maxValue = Math.max(maxValue, rigthPointer - leftPointer + 1);
                }
            }
        }
        return maxValue;
    }
}
