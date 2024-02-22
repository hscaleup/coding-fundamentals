package com.hscale.fundamentals.collections.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Abhishek Kumar on 22/02/2024
 */
class PlayWithArraysTest {
    private PlayWithArrays playWithArrays;

    @BeforeEach
    void setup() {
        playWithArrays = new PlayWithArrays();
    }

    @Test
    void test_filterEvenAndOddNumber() {
        int[] a = {1, 2, 3, 4, 5};
        int[] c = playWithArrays.filterEvenAndOddNumber(a);
        int[] expected = {2, 2, 6, 4, 10};
        assertArrayEquals(expected, c);
    }

    @Test
    void test_filterEvenAndOddNumber2() {
        int[] a = {1, 0, 0, 4, 5};
        int[] c = playWithArrays.filterEvenAndOddNumber(a);
        int[] expected = {2, 0, 0, 4, 10};
        assertArrayEquals(expected, c);
    }
}