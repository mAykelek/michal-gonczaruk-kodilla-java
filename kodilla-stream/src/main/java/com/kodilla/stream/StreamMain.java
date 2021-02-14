package com.kodilla.stream;

import com.kodilla.stream.beautifier.*;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("---Poem list:--- ");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        PoemBeautifier2 poemBeautifier2 = new PoemBeautifier2();
        PoemBeautifier3 poemBeautifier3 = new PoemBeautifier3();
        poemBeautifier2.beautify2(1, CreativeBeauties::creativeBeautify);
        poemBeautifier3.beautify3("Adam Mickewicz", AuthorBeauty::authorBeauty);
        poemBeautifier.beautify("lalala", "x1", Beauties::AbcAndLol);
        poemBeautifier2.beautify2(2, CreativeBeauties::creativeBeautify);
        poemBeautifier3.beautify3("William Shakespeare", AuthorBeauty::authorBeauty);
        poemBeautifier.beautify("trlalala", "x4", Beauties::CbaAndLol);
        poemBeautifier2.beautify2(3, CreativeBeauties::creativeBeautify);
        poemBeautifier3.beautify3("Jan Kochanowski", AuthorBeauty::authorBeauty);
        poemBeautifier.beautify("lalala", "x2", Beauties::AsdAndLol);
        poemBeautifier2.beautify2(4, CreativeBeauties::creativeBeautify);
        poemBeautifier3.beautify3("Henryk Sienkiewicz", AuthorBeauty::authorBeauty);
        poemBeautifier.beautify("tralalala", "x4", Beauties::ZxcAndLol);


    }
}