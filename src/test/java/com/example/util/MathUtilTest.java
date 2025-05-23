package com.example.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MathUtilTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testPower1() {
        double actualAnswer = MathUtil.power(0,-1);
        assertEquals(Double.POSITIVE_INFINITY, actualAnswer, "TC1: 期待値と実際の結果が異なります");
    }

    @Test
    void testPower3() {
        double actualAnswer = MathUtil.power(0, 0);
        assertEquals(1, actualAnswer, "TC3: 期待値と実際の値が異なります");
    }

    @Test
    void testPower21() {
        try {
            MathUtil.power(0, 100);
            fail("TC22: 例外が発生しなければなりません");
        } catch (IllegalArgumentException e) {
            assertEquals("100以上の値は不正です", e.getMessage(), "TC22: 期待値と実際の値が異なります");
        }
    }
}