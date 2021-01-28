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
            ("Testing if class is working properly when its empty," +
            " Testing if class is working properly when list contains objects" +
            " Method should return collection with even numbers.")

    @Test
    void testOddNumbersExterminatorNormalList() {
        // Given
        OddNumbersExterminator test = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        for(int n = 0; n<11; n++) {
            numbers.add(n);
        }
        // When
        boolean result1 = test.exterminate(List<Integer>);
        // Then
        Assertions.assertTrue(result1);


    }
    @Test
    void testOddNumbersExterminatorEmptyList() {
        // Given
        OddNumbersExterminator test = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        // When
        boolean result2 = test.exterminate(List<Integer>);
        // Then
        Assertions.assertTrue(result2);

    }

}
