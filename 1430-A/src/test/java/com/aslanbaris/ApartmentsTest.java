package com.aslanbaris;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ApartmentsTest {

    @Test
    void testThree() {
        Assertions.assertEquals("10 0 0", Apartments.calculateRooms(30));
    }

    @Test
    void testFive() {
        Assertions.assertEquals("0 7 0", Apartments.calculateRooms(35));
        Assertions.assertEquals("0 1 0", Apartments.calculateRooms(5));
    }

    @Test
    void testSeven() {
        Assertions.assertEquals("0 0 2", Apartments.calculateRooms(14));
        Assertions.assertEquals("0 0 4", Apartments.calculateRooms(28));
    }

    @Test
    void test2() {
        Assertions.assertEquals("4 11 0", Apartments.calculateRooms(67));
    }

    @Test
    void test3() {
        Assertions.assertNull(Apartments.calculateRooms(1));
        Assertions.assertNull(Apartments.calculateRooms(2));
        Assertions.assertNull(Apartments.calculateRooms(4));
    }

}
