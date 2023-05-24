package com.amogus.yandex.fintech.night.calendars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calendar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);

        int[] workTime = parseTime(br.readLine());
        int startWork = workTime[0];
        int endWork = workTime[1];

        boolean[] busy = new boolean[24 * 60];
        for (int i = 0; i < m; i++) {
            String[] line = br.readLine().split(" ");
            int member = Integer.parseInt(line[0]);
            int[] meetingTime = parseTime(line[1]);
            for (int j = meetingTime[0]; j < meetingTime[1]; j++) {
                busy[j] = true;
            }
        }

        int maxStart = -1;
        int maxEnd = -1;
        int maxDuration = -1;
        for (int i = startWork; i < endWork; i++) {
            if (!busy[i]) {
                int start = i;
                while (i < endWork && !busy[i]) {
                    i++;
                }
                int end = i;
                if (end - start > maxDuration) {
                    maxDuration = end - start;
                    maxStart = start;
                    maxEnd = end;
                }
            }
        }

        if (maxDuration == -1) {
            System.out.println("ALARM");
        } else {
            System.out.println(formatTime(maxStart) + "-" + formatTime(maxEnd));
        }
    }

    private static int[] parseTime(String time) {
        String[] parts = time.split("-");
        return new int[]{parseMinutes(parts[0]), parseMinutes(parts[1])};
    }

    private static int parseMinutes(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }

    private static String formatTime(int minutes) {
        return String.format("%02d:%02d", minutes / 60, minutes % 60);
    }
}

