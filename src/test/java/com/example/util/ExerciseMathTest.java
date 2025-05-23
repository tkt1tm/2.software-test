package com.example.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ExerciseMathTest {
    @Test
    void _テストに失敗させる() {
        fail("失敗しました");
    }

    @Test
    void _1を渡すと1が返る() {
        // 準備
        ExerciseMath exerciseMath = new ExerciseMath();

        // 実行
        int actualResult = exerciseMath.factorial(1);

        // 検証
        assertEquals(1, actualResult);
    }

    @Test
    void _2を渡すと2が返る() {
        // 準備
        ExerciseMath exerciseMath = new ExerciseMath();

        // 実行
        int actualResult = exerciseMath.factorial(2);

        // 検証
        assertEquals(2, actualResult);
    }

    @Test
    void _3を渡すと6が返る() {
        // 準備
        ExerciseMath exerciseMath = new ExerciseMath();

        // 実行
        int actualResult = exerciseMath.factorial(3);

        // 検証
        assertEquals(6, actualResult);
    }

    @Test
    void _4を渡すと6が返る() {
        // 準備
        ExerciseMath exerciseMath = new ExerciseMath();

        // 実行
        int actualResult = exerciseMath.factorial(4);

        // 検証
        assertEquals(24, actualResult);
    }

    @Test
    void _11を渡すと39916800が返る() {
        // 準備
        ExerciseMath exerciseMath = new ExerciseMath();

        // 実行
        int actualResult = exerciseMath.factorial(11);

        // 検証
        assertEquals(39916800, actualResult);
    }

    @Test
    void _12を渡すと479001600が返る() {
        // 準備
        ExerciseMath exerciseMath = new ExerciseMath();

        // 実行
        int actualResult = exerciseMath.factorial(12);

        // 検証
        assertEquals(479001600, actualResult);
    }
}
