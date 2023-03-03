package com.kodilla.rps;

public class RPSMain {

    public static void main(String[] args) {

        boolean result;
        Player player = new Player();
        Display display = new Display();

        do {
            player.askPlayerName();
            player.askRoundsWon();
            Moves moves = new Moves(player);
            moves.startNewGame();
            display.endOrRepeat();
            result = moves.exitMenu();
        }while (!result);
    }
}
