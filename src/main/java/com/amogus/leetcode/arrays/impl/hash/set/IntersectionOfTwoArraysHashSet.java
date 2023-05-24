package com.amogus.leetcode.arrays.impl.hash.set;

import com.amogus.leetcode.arrays.tasks.IntersectionOfTwoArrays;

import java.util.HashSet;
import java.util.Set;

/**
 * 349. Intersection of Two Arrays
 * https://leetcode.com/problems/intersection-of-two-arrays/
 * ==
 * Given two integer arrays nums1 and nums2,
 * return an array of their intersection.
 * Each element in the result must be unique and you may return the result in any order.
 * ==
 * Example 1:
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * ==
 * Example 2:
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Explanation: [4,9] is also accepted.
 */
public class IntersectionOfTwoArraysHashSet implements IntersectionOfTwoArrays {
    @Override
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> secondSet = new HashSet<>();

        for (int num : nums1) {
            firstSet.add(num);
        }

        for (int num : nums2) {
            secondSet.add(num);
        }

        Set<Integer> intersections = new HashSet<>();

        if (firstSet.size() < secondSet.size()) {
            for (int num : firstSet) {
                if (secondSet.contains(num)) {
                    intersections.add(num);
                }
            }
        } else {
            for (int num : secondSet) {
                if (firstSet.contains(num)) {
                    intersections.add(num);
                }
            }
        }

        int[] result = new int[intersections.size()];
        int idx = 0;
        for (int num : intersections) {
            result[idx++] = num;
        }

        return result;
    }
}
