package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.io.*;



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

        System.out.println();
        System.out.println("Poem Beautifier:");

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("tralalala", (text)-> text + "ABC");
        poemBeautifier.beautify("tralalala", (text)-> "ABC" + text);
        poemBeautifier.beautify("tralalala", (text)-> text.toUpperCase());
        poemBeautifier.beautify("TRalalala", (text)-> text.toLowerCase());
        poemBeautifier.beautify("tralalala", (text)-> text.replaceAll("", ", "));
        poemBeautifier.beautify("tralalala", (text)-> text.replaceFirst("a", "o"));

    }
}
