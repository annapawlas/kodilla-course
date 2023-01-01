package com.kodilla.exception.exponential;

public class Power {
    private int a;
    private int b;

    public int Power(int a, int b)  throws ArithmeticException {
        this.a = a;
        this.b = b;
        int result = 1;

        if (a == 0 && b == 0) {
            throw new ArithmeticException();
        } else {
            for (int i = 1; i < b+1; i++){
                result = result * a;
            }
        }

        return result;
    }

    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }


}
