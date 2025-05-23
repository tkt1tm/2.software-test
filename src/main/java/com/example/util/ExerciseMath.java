package com.example.util;

public class ExerciseMath {
    public int factorial(int n) {
        int total = 1;
        for (int i = n; 1 < i; i--) {
            total *= i;
        }
        return total;
    }
}
