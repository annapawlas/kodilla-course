package com.kodilla.rps;

import java.util.Scanner;

public class Moves {


    private Player player;
    private boolean end = false;
    private boolean newGame = false;
    private int playerScore = 0;
    private int computerScore = 0;
    private String playerChoice;

    public Moves(Player player) {
        this.player = player;
    }

    public void getReady() {
        player.askPlayerName();
        player.askRoundsWon();
        playerScore = 0;
        computerScore = 0;
        newGame = false;
    }

    public void setPlayerScore() {
        playerScore++;
    }
    public void setComputerScore() {
        computerScore++;
    }

    public boolean endGame() {
        String quitGame;
        System.out.println("Are you sure you want to quit this game? \n" +
                "Y - yes\n" +
                "N - no");
        Scanner scanner = new Scanner(System.in);
        do {
            quitGame = scanner.next();
        } while ((!quitGame.equals("y")) && (!(quitGame.equals("n"))));
        if (quitGame.equals("y")){
            return true;
        } else return false;
    }

    public boolean newGame() {
        String newGame;
        System.out.println("Are you sure you want to start a new game? \n" +
                "Y - yes\n" +
                "N - no");
        Scanner scanner = new Scanner(System.in);
        do {
            newGame = scanner.next();
        } while ((!newGame.equals("y")) && (!(newGame.equals("n"))));
        if (newGame.equals("y")){
            player.askPlayerName();
            player.askRoundsWon();
            playerScore = 0;
            computerScore = 0;
            startNewGame();
            return true;
        } else return false;

    }

    public boolean exitMenu() {
        String exitGame;
        Scanner scanner = new Scanner(System.in);
        do {
            exitGame = scanner.next();
        } while ((!exitGame.equals("x")) && (!(exitGame.equals("n"))));
        return (exitGame.equals("x"));
    }

    public void playerMove() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Insert your choice (1, 2 or 3): ");
            playerChoice = scanner.next();
            if (playerChoice.equals("1")) {
                System.out.println("Your choice: ");
                System.out.println("Stone");
            } else if (playerChoice.equals("2")) {
                System.out.println("Your choice: ");
                System.out.println("Paper");
            } else if (playerChoice.equals("3")) {
                System.out.println("Your choice: ");
                System.out.println("Scissors");
            } else if (playerChoice.equals("n")) {
                newGame = newGame();
            } else if (playerChoice.equals("x")) {
                end = endGame();
            }else System.out.println("Incorrect input. Please try again.");
        } while (playerScore != player.getNumberOfWins() && computerScore != player.getNumberOfWins()
                && !(playerChoice.equals("1")) && !(playerChoice.equals("2")) && !(playerChoice.equals("3"))
                && !end && !newGame);
    }

    public void startNewGame() {

        int computerChoice;
        Computer computer = new Computer();
        Display display = new Display();
        display.displayInstruction();

        while (!end && !newGame) {
            playerMove();
            if (!end && !newGame) {
                computerChoice = computer.GetRandom();
                System.out.println("Computer choice: ");
                if (computerChoice == 1) {
                    System.out.println("Stone");
                } else if (computerChoice == 2) {
                    System.out.println("Paper");
                } else System.out.println("Scissors");

                if (!end && !newGame) {
                    if (!playerChoice.equals(computerChoice)) {
                        if ((playerChoice.equals("1")) && (computerChoice == 2)) {
                            setComputerScore();
                            display.lostRound(playerScore, computerScore);
                        } else if ((playerChoice.equals("1")) && (computerChoice == 3)) {
                            setPlayerScore();
                            display.wonRound(playerScore, computerScore);
                        } else if ((playerChoice.equals("2")) && (computerChoice == 1)) {
                            setPlayerScore();
                            display.wonRound(playerScore, computerScore);
                        } else if ((playerChoice.equals("2")) && (computerChoice == 3)) {
                            setComputerScore();
                            display.lostRound(playerScore, computerScore);
                        } else if ((playerChoice.equals("3")) && (computerChoice == 1)) {
                            setComputerScore();
                            display.lostRound(playerScore, computerScore);
                        } else if ((playerChoice.equals("3")) && (computerChoice == 2)) {
                            setPlayerScore();
                            display.wonRound(playerScore, computerScore);
                        } else {
                            display.drawRound(playerScore, computerScore);
                        }
                    }

                    if ((playerScore == player.getNumberOfWins()) || (computerScore == player.getNumberOfWins())) {
                        end = true;
                        if (playerScore == player.getNumberOfWins()) {
                            System.out.println("You won the match. The result of the match is " + playerScore + " : " + computerScore + ".");
                        } else if (computerScore == player.getNumberOfWins()) {
                            System.out.println("You lost the match. The result of the match is " + playerScore + " : " + computerScore + ".");
                        }
                        if (newGame) {
                            getReady();
                        }

                    }
                }
            }
        }
    }
}

