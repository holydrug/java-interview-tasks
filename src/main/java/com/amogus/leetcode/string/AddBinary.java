package com.amogus.leetcode.string;

import java.math.BigInteger;

/**
 * 67. Add Binary
 * https://leetcode.com/problems/add-binary/
 * ==
 * Given two binary strings a and b, return their sum as a binary string.
 * ==
 * Example 1:
 * Input: a = "11", b = "1"
 * Output: "100"
 * ==
 * Example 2:
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        BigInteger aBigInt = new BigInteger(a, 2);
        BigInteger bBigInt = new BigInteger(b, 2);

        return aBigInt.add(bBigInt).toString(2);
    }
}
