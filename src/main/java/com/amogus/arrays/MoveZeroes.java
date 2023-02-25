package com.amogus.arrays;

/**
 * 283. Move Zeroes
 * https://leetcode.com/problems/move-zeroes/
 * ==
 * Given an integer array nums,
 * move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 * ==
 * Example 1:
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * ==
 * Example 2:
 * Input: nums = [0]
 * Output: [0]
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int firstPointer = 0;
        int secondPointer = 0;
        while (secondPointer < nums.length) {
            if (nums[firstPointer] != 0 ) {
                firstPointer++;
                secondPointer++;
            } else if (nums[secondPointer] == 0) {
                secondPointer++;
            } else {
                int nonZero = nums[secondPointer];
                nums[secondPointer] = nums[firstPointer];
                nums[firstPointer] = nonZero;
            }
        }
    }
}
