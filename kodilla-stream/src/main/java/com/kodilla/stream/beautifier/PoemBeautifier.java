package com.kodilla.stream.beautifier;


public class PoemBeautifier {

    public void beautify(String text, PoemDecorator poemDecorator) {
        String decoratedText = poemDecorator.decorate(text);
        System.out.println("Before: "+ text + ", after: " + decoratedText);

    }

}
