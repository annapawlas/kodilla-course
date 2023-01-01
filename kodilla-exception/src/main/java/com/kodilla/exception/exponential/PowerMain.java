package com.kodilla.exception.exponential;

public class PowerMain {
    public static void main(String[] args) {

        try{
            Power power = new Power();
            power.Power(0,5);
            power.Power(5,0);
            power.Power(5,1);
            power.Power(5,5);
            power.Power(0,0);


        }catch (ArithmeticException e){
            System.out.println("Zero to the power of zero is not defined.");
        }

    }
}
