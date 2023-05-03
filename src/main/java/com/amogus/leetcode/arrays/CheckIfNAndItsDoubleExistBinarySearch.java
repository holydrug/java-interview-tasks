package com.amogus.leetcode.arrays;

import java.util.Arrays;

/**
 * 1346. Check If N and Its Double Exist
 * https://leetcode.com/problems/check-if-n-and-its-double-exist/description/
 * ==
 * Given an array arr of integers, check if there exist two indices i and j such that :
 *     i != j
 *     0 <= i, j < arr.length
 *     arr[i] == 2 * arr[j]
 * ==
 * Example 1:
 * Input: arr = [10,2,5,3]
 * Output: true
 * Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
 * ==
 * Example 2:
 * Input: arr = [3,1,7,11]
 * Output: false
 * Explanation: There is no i and j that satisfy the conditions.
 *
 */
public class CheckIfNAndItsDoubleExistBinarySearch {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int low = 0;
            int high = arr.length - 1;
            int target = arr[i] * 2;

            while (low <= high) {
                int middle = low + (high - low) / 2;

                if (arr[middle] == target && middle != i) {
                    return true;
                } else if (arr[middle] < target) {
                    low = middle + 1;
                } else {
                    high = middle - 1;
                }
            }
        }

        return false;
    }
}
