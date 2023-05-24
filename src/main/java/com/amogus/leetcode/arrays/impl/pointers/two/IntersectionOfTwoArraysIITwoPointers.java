package com.amogus.leetcode.arrays.impl.pointers.two;

import com.amogus.leetcode.arrays.tasks.IntersectionOfTwoArraysII;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 350. Intersection of Two Arrays II
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
 * ==
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result
 * must appear as many times as it shows in both arrays and you may return the result in any order.
 * ==
 * Example 1:
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * ==
 * Example 2:
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Explanation: [9,4] is also accepted.
 */
public class IntersectionOfTwoArraysIITwoPointers implements IntersectionOfTwoArraysII {
    @Override
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();

        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int idx = 0;
        for (int num : nums2) {
            int counter = map.getOrDefault(num, 0);
            if (counter > 0) {
                nums1[idx++] = num;
                map.put(num, counter - 1);
            }
        }

        return Arrays.copyOfRange(nums1, 0, idx);
    }
}
