package com.amogus.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * 448. Find All Numbers Disappeared in an Array
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 * ==
 * Given an array nums of n integers
 * where nums[i] is in the range [1, n],
 * return an array of all the integers in the range [1, n] that do not appear in nums.
 * ==
 * Example 1:
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [5,6]
 * ==
 * Example 2:
 * Input: nums = [1,1]
 * Output: [2]
 */
public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> listToReturn = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int trueIndex = Math.abs(nums[i]) - 1;
            if (nums[trueIndex] > 0) {
                nums[trueIndex] = nums[trueIndex] * -1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                listToReturn.add(i + 1);
            }
        }

        return listToReturn;
    }
}
