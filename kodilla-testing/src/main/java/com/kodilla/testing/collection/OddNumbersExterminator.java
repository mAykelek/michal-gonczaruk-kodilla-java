package com.kodilla.testing.collection;

import java.util.*;
public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {

        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();
        numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);


            for (int iteration : numbers) {

                if (iteration % 2 == 0) {
                    System.out.println("Adding even number to collection.");
                    evenNumbers.add(iteration);
                    } else {
                    System.out.println("Adding odd number to collection.");
                    oddNumbers.add(iteration);
                    }
                System.out.println("Odd numbers: " + oddNumbers);
                System.out.println("Even numbers: " + evenNumbers);

            }
        return evenNumbers;
    }
}






