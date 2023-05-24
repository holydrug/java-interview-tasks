package com.amogus.leetcode.string.impl.pointers.two;

import com.amogus.leetcode.string.tasks.FindTheIndexOfTheFirstOccurrenceInAString;

/**
 * 28. Find the Index of the First Occurrence in a String
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
 * ==
 * Given two strings needle and haystack,
 * return the index of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack.
 * ==
 * Example 1:
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 * ==
 * Example 2:
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 */
public class FindTheIndexOfTheFirstOccurrenceInAStringKMP implements FindTheIndexOfTheFirstOccurrenceInAString {
    @Override
    public int strStr(String haystack, String needle) {
        int[] prefixes = prefixFunc(needle);
        for (int i = 0, j = 0; i < haystack.length(); i++) {
            while (j > 0 && needle.charAt(j) != haystack.charAt(i)) {
                j = prefixes[j - 1];
            }

            if (needle.charAt(j) == haystack.charAt(i)) {
                j++;
            }

            if (needle.length() == j) {
                return i - j + 1;
            }
        }
        return -1;
    }

    public int[] prefixFunc(String pattern) {
        int[] prefixes = new int[pattern.length()];

        int j = 0;
        for (int i = 1; i < pattern.length(); i++) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = prefixes[j - 1];
            }

            if (pattern.charAt(i) == pattern.charAt(j)) {
                j++;
            }

            prefixes[i] = j;
        }

        return prefixes;
    }
}
