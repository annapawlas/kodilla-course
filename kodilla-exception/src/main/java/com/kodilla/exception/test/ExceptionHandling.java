package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        try {
            SecondChallenge secondChallenge = new SecondChallenge();
            String result = secondChallenge.probablyIWillThrowException(1.5,1.7);
            System.out.println(result);
        }catch (Exception e){
            System.out.println("Incorrect number");
        }finally {
            System.out.println("The end.");
        }
    }

}
