package com.kodilla.good.patterns.challenges;

public class Factorial {

    int number;
    int result = 1;

    public int Factorial(int number) {
        this.number = number;

        for (int i = 1; i <= number; i++){
            result = result * i;
        } return result;
    }

}
