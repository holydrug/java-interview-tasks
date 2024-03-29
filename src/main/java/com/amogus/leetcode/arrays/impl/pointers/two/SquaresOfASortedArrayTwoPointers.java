package com.amogus.leetcode.arrays.impl.pointers.two;


import com.amogus.leetcode.arrays.tasks.SquaresOfASortedArray;

/**
 * 977. Squares of a Sorted Array
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 * ==
 * Given an integer array nums sorted in non-decreasing order,
 * return an array of the squares of each number sorted in non-decreasing order.
 * ==
 * Example 1:
 * ==
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 * ==
 * Example 2:
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 */
public class SquaresOfASortedArrayTwoPointers implements SquaresOfASortedArray {
    @Override
    public int[] sortedSquares(int[] nums) {
        int lPointer = 0;
        int rPointer = nums.length - 1;
        int[] sortedArray = new int[nums.length];

        for(int i = nums.length - 1; i >= 0; i--) {
            int left = Math.abs(nums[lPointer]);
            int right = Math.abs(nums[rPointer]);

            if (left > right) {
                sortedArray[i] = left * left;
                lPointer++;
            } else {
                sortedArray[i] = right * right;
                rPointer--;
            }
        }
        return sortedArray;
    }
}
