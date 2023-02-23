package com.amogus.arrays;

/**
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 * https://leetcode.com/problems/max-consecutive-ones/
 * ==
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 * ==
 * Example 1:
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 * The maximum number of consecutive 1s is 3.
 * ==
 * Example 2:
 * Input: nums = [1,0,1,1,0,1]
 * Output: 2
 */
public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int countMax = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                count++;
            } else {
                countMax = Math.max(count, countMax);
                count = 0;
            }
        }
        return Math.max(count, countMax);
    }
}
