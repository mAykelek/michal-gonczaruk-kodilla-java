package com.kodilla;

class Calculator {
    int a;
    int b;
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int substractAFromB() {
        return a - b;
    }
    public int sumAAndB() {
        return a + b;
    }
}
class Program {
    public static void main (String[] args) {
        Calculator calc = new Calculator(1, 5);
        int result1 = calc.substractAFromB();
        int result2 = calc.sumAAndB();
        System.out.println(result1);
        System.out.println(result2);
    }
}
