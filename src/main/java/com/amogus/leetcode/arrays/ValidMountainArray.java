package com.amogus.leetcode.arrays;

/**
 * 941. Valid Mountain Array
 * https://leetcode.com/problems/valid-mountain-array/description/
 * ==
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 * ==
 * Example 1:
 * Input: arr = [2,1]
 * Output: false
 * ==
 * Example 2:
 * Input: arr = [3,5,5]
 * Output: false
 * ==
 * Example 3:
 * Input: arr = [0,3,2,1]
 * Output: true
 */
public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }

        int firstPointer = 0;
        int lastPointer = arr.length - 1;

        while (firstPointer < lastPointer) {
            if (arr[firstPointer + 1] > arr[firstPointer]) {
                firstPointer++;
            } else if (arr[lastPointer - 1] > arr[lastPointer]) {
                lastPointer--;
            } else {
                break;
            }
        }

        return firstPointer != 0 && lastPointer != arr.length - 1 && firstPointer == lastPointer;
    }
}
