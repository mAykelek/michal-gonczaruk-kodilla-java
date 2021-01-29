package com.kodilla.testing.forum.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;

class CollectionTestSuite {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName
            ("Method should return collection with even numbers.")

    @Test
    void testOddNumbersExterminatorNormalList() {
        // Given
        OddNumbersExterminator test = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
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
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(0);
        expectedResult.add(2);
        expectedResult.add(4);
        expectedResult.add(6);
        expectedResult.add(8);
        expectedResult.add(10);

        // When
        List<Integer> result = test.exterminate(numbers);
        // Then
        Assertions.assertEquals(expectedResult, result);
    }
    @DisplayName
            ("Testing if class is working properly when its empty,")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        // Given
        OddNumbersExterminator test = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(0);
        expectedResult.add(2);
        expectedResult.add(4);
        expectedResult.add(6);
        expectedResult.add(8);
        expectedResult.add(10);
        // When
        List<Integer> result = test.exterminate(numbers);
        // Then
        Assertions.assertEquals(expectedResult, result);

    }

}
