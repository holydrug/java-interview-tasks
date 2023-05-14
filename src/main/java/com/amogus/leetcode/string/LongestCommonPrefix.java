package com.amogus.leetcode.string;

/**
 * 14. Longest Common Prefix
 * https://leetcode.com/problems/longest-common-prefix/description/
 * ==
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * ==
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * ==
 * Example 2:
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            prefix = commonPrefix(prefix, strs[i]);
        }

        return prefix;
    }

    private String commonPrefix(String prefix, String str) {
        int minLengthOfString = Math.min(prefix.length(), str.length());

        for (int i = 0; i < minLengthOfString; i++) {
            if (prefix.charAt(i) != str.charAt(i)) {
                return prefix.substring(0, i);
            }
        }

        return prefix.substring(0, minLengthOfString);
    }
}
