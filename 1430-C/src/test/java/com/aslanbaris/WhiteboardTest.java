package com.aslanbaris;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WhiteboardTest {

    @Test
    void test() {
         String res = Whiteboard.calculateMin(200000);

        Assertions.assertEquals("2\n4 3\n4 2\n3 1", res);
    }

    @Test
    void test2() {
         String res = Whiteboard.calculateMin(7);

        Assertions.assertEquals("2\n7 6\n7 5\n6 4\n5 3\n4 2\n3 1", res);
    }

    @Test
    void test3() {
         String res = Whiteboard.calculateMin(2);

        Assertions.assertEquals("2\n2 1", res);
    }
}

/*
* 1 2 3 4 5 6 7
* 1 2 3 4 5 7
* 1 2 3 4 6
* 1 2 3 5
* 1 2 4
* 1 3
* 2
* */