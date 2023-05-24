package com.amogus.leetcode.arrays.impl.pointers.two;

import com.amogus.leetcode.arrays.tasks.DuplicateZeros;

public class DuplicateZersosTwoPointers implements DuplicateZeros {
    @Override
    public int[] modifyArray(int[] array) {
        int numberOfZeros = 0;
        for (int elem : array) {
            if (elem == 0) {
                numberOfZeros++;
            }
        }

        int firstPointer = array.length - 1;
        int lastPointer = array.length - 1 + numberOfZeros;
        while (lastPointer != firstPointer) {
            if (lastPointer-- < array.length) {
                array[++lastPointer] = array[firstPointer];
                lastPointer--;
            }

            if (array[firstPointer] == 0) {
                if (lastPointer-- < array.length) {
                    array[++lastPointer] = 0;
                    lastPointer--;
                }
            }
            firstPointer--;
        }
        return array;
    }
}
