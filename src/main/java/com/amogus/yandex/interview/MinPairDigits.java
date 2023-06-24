package com.amogus.yandex.interview;

/**
 * Дана последовательность целых чисел.
 * Необходимо найти минимально возможное произведение пары элементов последовательности
 * (пара - два каких-то элемента, не обязательно подряд идущие).
 * Например, для последовательности чисел 9 4 2 5 3 ответ будет 6.
 */
public class MinPairDigits {
    public long minPairDigits(int[] arr) {
        if (arr.length < 2 || arr == null) {
            throw new IllegalArgumentException("Array must contains at least two elements");
        }

        long min1 = Integer.MAX_VALUE;
        long min2 = Integer.MAX_VALUE;
        long max1 = Integer.MIN_VALUE;
        long max2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2) {
                min2 = arr[i];
            }

            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }

        long value1 = min1 * max1;
        long value2 = Math.min(min1 * min2, max1 * max2);

        return Math.min(value1, value2);
    }
}
