package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> moviesMap = MovieStore.getMovies();
        String movies = moviesMap.entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .map(Object::toString)
                .collect(Collectors.joining(" ! ", "", ""));
        System.out.println(movies);
    }
}
