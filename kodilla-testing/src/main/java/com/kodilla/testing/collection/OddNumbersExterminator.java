package com.kodilla.testing.collection;

import java.util.*;
public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {

        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();

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






