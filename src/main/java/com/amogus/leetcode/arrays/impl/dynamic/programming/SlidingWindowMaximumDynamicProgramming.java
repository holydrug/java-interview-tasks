package com.amogus.leetcode.arrays.impl.dynamic.programming;

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
public class SlidingWindowMaximumDynamicProgramming implements SlidingWindowMaximum {
    @Override
    public int[] maxSlidingWindow(int[] nums, int k) {
        MonotonicQueue monotonicQueue = new MonotonicQueue();
        int[] result = new int[nums.length - k + 1];
        int resultIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            monotonicQueue.push(nums[i]);

            if (i >= k - 1) {
                result[resultIndex++] = monotonicQueue.max();

                if (monotonicQueue.max() == nums[i - k + 1]) {
                    monotonicQueue.pop();
                }
            }
        }

        return result;
    }

    class MonotonicQueue {
        Deque<Integer> deque = new LinkedList<>();

        public void push(int elem) {
            while (!deque.isEmpty() && elem > deque.peekLast()) {
                deque.pollLast();
            }

            deque.offerLast(elem);
        }

        public void pop() {
            deque.pollFirst();
        }

        public int max() {
            return deque.getFirst();
        }
    }
}
