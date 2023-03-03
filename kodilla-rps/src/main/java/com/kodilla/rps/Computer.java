package com.kodilla.rps;

import java.util.Random;

public class Computer {
    public int GetRandom() {
        Random generator = new Random();
        int random = generator.nextInt(3)+1;
        return random;
    }
}
