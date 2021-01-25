package com.kodilla.testing.calculator;

public class Calculator {
    int a;
    int b;
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int getSum() {
        return a + b;
    }
    public int getSubstract() {
        return a - b;
    }
}