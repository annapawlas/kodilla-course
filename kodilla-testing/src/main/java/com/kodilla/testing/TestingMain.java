package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println("Calculator test...");

        Calculator calculator1 = new Calculator();

        if (calculator1.addAToB(5.3, 2.8) == 8.1) {
            System.out.println("Addition test - ok!");
        }
        else {
            System.out.println("Addition test - error");
        }

        if (calculator1.substractBFromA(5.3, 2.8) == 2.5) {
            System.out.println("Substraction test - ok!");
        }
        else {
            System.out.println("Substraction test - error");
        }

    }
}
