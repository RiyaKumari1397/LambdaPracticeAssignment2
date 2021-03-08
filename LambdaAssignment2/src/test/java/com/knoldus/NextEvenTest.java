package com.knoldus;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class NextEvenTest {
    NextEven nextEven = new NextEven();

    @org.junit.jupiter.api.Test
    void whenValueIsOdd() {
        long test1 = nextEven.FindNextEven(5678977l);
        Assertions.assertEquals(5678978l,test1);
    }
    @org.junit.jupiter.api.Test
    void whenValueIsEven() {
        long test2 = nextEven.FindNextEven(12345678l);
        Assertions.assertEquals(12345680l,test2);
}
    @org.junit.jupiter.api.Test
    void whenValueIsZero() {
        long test3 = nextEven.FindNextEven(0l);
        Assertions.assertEquals(2l,test3);
    }
    @org.junit.jupiter.api.Test
    void whenValueIsNegative() {
        long test4 = nextEven.FindNextEven(-1);
        Assertions.assertEquals(0,test4);
    }
}