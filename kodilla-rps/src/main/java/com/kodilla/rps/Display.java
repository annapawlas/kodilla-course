package com.kodilla.rps;



public class Display {

    public void displayInstruction () {
        System.out.println("=========================================================");
        System.out.println("******************* STARTING THE GAME *******************");
        System.out.println("=========================================================");
        System.out.println();
        System.out.println("Instructions: \n" +
                "1. Key 1 - playing \"stone\"\n" +
                "2. Key 2 - playing \"paper\"\n" +
                "3. Key 3 - playing \"scissors\"\n" +
                "4. Key x - end of the game\n" +
                "5. Key n - restarting the game\n"
        );
    }

    public void endOrRepeat(){
        System.out.println("Do you want to play again?\n" +
                "Press \"n\" to start a new game\n" +
                "Press \"x\" to exit");
    }

    public void wonRound(int wonRounds, int lostRounds){
        System.out.println("You won this round! The result is " + wonRounds + " : " + lostRounds + ".");
    }
    public void lostRound(int wonRounds, int lostRounds){
        System.out.println("You lost this round. The result is " + wonRounds + " : " + lostRounds + ".");
    }
    public void drawRound(int wonRounds, int lostRounds){
        System.out.println("It's a draw. The result is " + wonRounds + " : " + lostRounds + ".");
    }





}
