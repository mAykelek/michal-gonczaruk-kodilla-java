package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public final class Array implements ArrayOperations {

    public static OptionalDouble getAverage(int[] numbers) {
        IntStream.range(0, 20)
                .toArray();
        OptionalDouble average = IntStream.range(0, 20)
                .average();
        return average;
    }
}
