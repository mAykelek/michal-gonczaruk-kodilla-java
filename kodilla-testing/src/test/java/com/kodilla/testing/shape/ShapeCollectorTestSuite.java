package com.kodilla.testing.shape;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.*;

@DisplayName("TDD: Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
}
@Nested
@DisplayName("Test for Square:")
class TestSquare {
    @Test
    void testAddSquare() {

        //Given
        Shape square = new Square("Square",50);
        ShapeCollector select = new ShapeCollector();
        //When
        select.addFigure(square);
        //Then
        Assertions.assertEquals(square, select.getFigure(0));

    }

    @Test
    void testRemoveSquare() {

        //Given
        Shape square = new Square("Square", 50);
        ShapeCollector select = new ShapeCollector();
        select.addFigure(square);
        //When
        boolean remove = select.removeFigure(square);
        //Then
        Assertions.assertTrue(remove);

    }

    @Test
    void testGetSquare() {

        //Given
        Shape square = new Square("Square", 50);
        ShapeCollector select = new ShapeCollector();
        select.addFigure(square);
        //When
        Shape takenSquare;
        takenSquare = select.getFigure(0);
        //Then
        Assertions.assertEquals(square, takenSquare);

    }
}

