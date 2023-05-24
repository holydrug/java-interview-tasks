package com.amogus.leetcode.arrays.impl.hash.set;

import com.amogus.leetcode.arrays.tasks.CheckIfNAndItsDoubleExist;

import java.util.HashSet;
import java.util.Set;

/**
 * 1346. Check If N and Its Double Exist
 * https://leetcode.com/problems/check-if-n-and-its-double-exist/description/
 * ==
 * Given an array arr of integers, check if there exist two indices i and j such that :
 * i != j
 * 0 <= i, j < arr.length
 * arr[i] == 2 * arr[j]
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
 */
public class CheckIfNAndItsDoubleExistHashSet implements CheckIfNAndItsDoubleExist {
    @Override
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i] * 2) || (arr[i] % 2 == 0 && set.contains(arr[i] / 2))) {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}
