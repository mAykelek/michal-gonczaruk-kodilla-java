package com.kodilla.stream.beautifier;

public class PoemBeautifier2 {
    public void beautify2(int a, PoemDecorator2 poemDecorator2) {
        int result = poemDecorator2.decorate2(a);
        System.out.println("beautifier: " + result);
    }
}
