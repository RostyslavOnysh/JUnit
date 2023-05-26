package org.JUnit.Intro.BestPractice;

public class Calculator {

    public double calculate(int a, int b, String operation) {
        if (operation.equals("+")) {
            return a + b;
        }
        if (operation.equals("/")) {
            return (double) a / b;
        }
        return a - b;
    }
}
