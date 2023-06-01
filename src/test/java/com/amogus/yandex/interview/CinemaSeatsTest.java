package com.amogus.yandex.interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CinemaSeatsTest {

    private CinemaSeats underTest;

    @BeforeEach
    void setUp() {
        underTest = new CinemaSeats();
    }

    @Test
    void findBestSeatDist1() {
        int[] input = new int[]{1, 0, 0, 0, 1};
        int output = 2;

        int result = underTest.findBestSeatDist(input);

        Assertions.assertEquals(output, result);
    }

    @Test
    void findBestSeatDist2() {
        int[] input = new int[]{1, 0, 0, 0, 0};
        int output = 4;

        int result = underTest.findBestSeatDist(input);

        Assertions.assertEquals(output, result);
    }

    @Test
    void findBestSeatDist3() {
        int[] input = new int[]{0, 0, 0, 0, 1};
        int output = 4;

        int result = underTest.findBestSeatDist(input);

        Assertions.assertEquals(output, result);
    }
}