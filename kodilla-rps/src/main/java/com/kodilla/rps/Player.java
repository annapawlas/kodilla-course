package com.kodilla.rps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {
    Scanner scanner = new Scanner(System.in);
    boolean continueInput;
    private String PlayerName;
    private int numberOfWins;


    public String getPlayerName() {
        return PlayerName;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public void setPlayerName(String playerName) {
        PlayerName = playerName;
    }

    public void setNumberOfWins(int numberOfWins) {
        this.numberOfWins = numberOfWins;
    }

    public void askPlayerName () {
        System.out.println("Insert your name:");
        String result = scanner.next();
        setPlayerName(result);
    }

    public void askRoundsWon (){
        continueInput = true;
        System.out.println("Insert the number of rounds won to win the entire match:");
        do {
            try {
                int result = scanner.nextInt();
                setNumberOfWins(result);
                continueInput = false;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect input: an integer is required. Try again.");
                scanner.nextLine();
            }
        } while (continueInput);
    }
}
