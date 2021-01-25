package com.kodilla.testing.calculator;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(8, 3);
        int sum = calculator.getSum();
        int substract = calculator.getSubstract();

                if(sum == 11) {
                    System.out.println("method getSum is working properly");
                } else {
                    System.out.println("method sum is not working properly");
                }
                if(substract == 5) {
                    System.out.println("method getSubstract is working properly");
                }
                else {
                    System.out.println("method getSubstract is not working properly");
        }
    }
}
