package com.amogus.yandex.fintech.night.scooters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Scooters {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input1 = reader.readLine();
        String input2 = reader.readLine();
        System.out.println(add(input1, input2));
    }

    public static String add(String input1, String input2) {
        List<Integer> num1 = parseInput(input1);
        List<Integer> num2 = parseInput(input2);
        int n1 = num1.size();
        int n2 = num2.size();
        int maxLen = Math.max(n1, n2);
        int carry = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < maxLen; i++) {
            int a = i < n1 ? num1.get(n1 - 1 - i) : 0;
            int b = i < n2 ? num2.get(n2 - 1 - i) : 0;
            int sum = a + b + carry;
            result.add(0, sum % 10);
            carry = sum / 10;
        }
        if (carry > 0) {
            result.add(0, carry);
        }
        return result.toString();
    }

    private static List<Integer> parseInput(String input) {
        String[] parts = input.substring(1, input.length() - 1).split(", ");
        List<Integer> result = new ArrayList<>();
        for (String part : parts) {
            result.add(Integer.parseInt(part));
        }
        return result;
    }
}

