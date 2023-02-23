package com.amogus.arrays;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1089. Duplicate Zeros
 * https://leetcode.com/problems/duplicate-zeros/
 * ==
 * Given a fixed-length integer array arr, duplicate each occurrence of zero,
 * shifting the remaining elements to the right.
 * ==
 * Example 1:
 * Input: arr = [1,0,2,3,0,4,5,0]
 * Output: [1,0,0,2,3,0,0,4]
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 * ==
 * Example 2:
 * Input: arr = [1,2,3]
 * Output: [1,2,3]
 * Explanation: After calling your function, the input array is modified to: [1,2,3]
 */
public class DuplicateZeros {
    public static int[] modifyArray(int[] array) {
        Queue<Integer> buffer = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                buffer.add(0);
                buffer.add(0);
            } else {
                buffer.add(array[i]);
            }
            array[i] = buffer.poll();
        }
        return array;
    }
}

