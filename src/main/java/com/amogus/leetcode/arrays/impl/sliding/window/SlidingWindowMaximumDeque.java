package com.amogus.leetcode.arrays.impl.sliding.window;

import com.amogus.leetcode.arrays.tasks.SlidingWindowMaximum;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 239. Sliding Window Maximum
 * https://leetcode.com/problems/sliding-window-maximum/
 * ==
 * You are given an array of integers nums,
 * there is a sliding window of size k
 * which is moving from the very left of the array to the very right.
 * You can only see the k numbers in the window.
 * Each time the sliding window moves right by one position.
 * Return the max sliding window.
 * ==
 * Example 1:
 * Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
 * Output: [3,3,5,5,6,7]
 * Explanation:
 * Window position                Max
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 *  1 [3  -1  -3] 5  3  6  7       3
 *  1  3 [-1  -3  5] 3  6  7       5
 *  1  3  -1 [-3  5  3] 6  7       5
 *  1  3  -1  -3 [5  3  6] 7       6
 *  1  3  -1  -3  5 [3  6  7]      7
 * ==
 * Example 2:
 * Input: nums = [1], k = 1
 * Output: [1]
 */
public class SlidingWindowMaximumDeque implements SlidingWindowMaximum {
    @Override
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new LinkedList<>();

        int[] result = new int[nums.length - k + 1];
        int resultIndex = 0;
        for (int i = 0; i < nums.length; i++) {

            if (!deque.isEmpty() && deque.peekFirst() == i - k) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            deque.offerLast(i);

            if (i >= k - 1) {
                result[resultIndex++] = nums[deque.peekFirst()];
            }
        }

        return result;
    }
}
