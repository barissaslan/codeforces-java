package com.aslanbaris;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BarrelsTest {

    @Test
    void test() {
        Barrels barrels = new Barrels(new long[]{5, 5, 5, 5}, 1);

        long maxDifference = barrels.calculateMaxDifference();

        assertEquals(10, maxDifference);
    }

    @Test
    void test2() {
        Barrels barrels = new Barrels(new long[]{0, 0, 0}, 2);

        long maxDifference = barrels.calculateMaxDifference();

        assertEquals(0, maxDifference);
    }

    @Test
    void test3() {
        Barrels barrels = new Barrels(new long[]{9, 4, 2, 3, 88, 6, 56, 88}, 2);

        long maxDifference = barrels.calculateMaxDifference();

        assertEquals(232, maxDifference);
    }

    @Test
    void test4() {
        Barrels barrels = new Barrels(new long[]{9, 4, 2, 3, 88, 6, 56, 88}, 5);

        long maxDifference = barrels.calculateMaxDifference();

        assertEquals(251, maxDifference);
    }

}
