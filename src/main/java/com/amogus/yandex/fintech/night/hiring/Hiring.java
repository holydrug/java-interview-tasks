package com.amogus.yandex.fintech.night.hiring;

import java.util.Scanner;

public class Hiring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int m = scanner.nextInt();
        int[] minTime = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            minTime[i] = Integer.MAX_VALUE;
        }
        minTime[x] = 0;
        int[][] edges = new int[m][3];
        for (int i = 0; i < m; i++) {
            edges[i][0] = scanner.nextInt();
            edges[i][1] = scanner.nextInt();
            edges[i][2] = scanner.nextInt();
        }
        for (int k = 0; k < n - 1; k++) {
            for (int i = 0; i < m; i++) {
                int a = edges[i][0];
                int b = edges[i][1];
                int t = edges[i][2];
                if (minTime[a] != Integer.MAX_VALUE && minTime[b] > minTime[a] + t) {
                    minTime[b] = minTime[a] + t;
                }
            }
        }
        boolean hasNegativeCycle = false;
        for (int i = 0; i < m; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            int t = edges[i][2];
            if (minTime[a] != Integer.MAX_VALUE && minTime[b] > minTime[a] + t) {
                hasNegativeCycle = true;
                break;
            }
        }
        if (hasNegativeCycle) {
            System.out.println("Negative cycle detected");
        } else {
            int maxTime = Integer.MIN_VALUE;
            for (int i = 1; i <= n; i++) {
                if (minTime[i] == Integer.MAX_VALUE) {
                    System.out.println(-1);
                    return;
                }
                maxTime = Math.max(maxTime, minTime[i]);
            }
            System.out.println(maxTime);
        }
    }
}

