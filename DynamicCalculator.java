package com.aseem.day2;

import java.util.Scanner;

public class DynamicCalculator {
    public static void main(String[] args) {
        final String SUM = "+";
        final String SUBTRACT = "=";
        final String MULTIPLY = "*";
        final String DIVIDE = "/";

        Scanner scanner = new Scanner(System.in);
        double total = 0;

        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Enter the operator(symbol) you would like to use x: ");
        scanner.nextLine();
        String operator = scanner.nextLine();

        if(operator.equals(SUM)) {
            total = num1 + num2;
        }
        else if(operator.equals(SUBTRACT)){
            total = num1 - num2;
        }
        else if(operator.equals(MULTIPLY)){
            total = num1 * num2;
        }
        else if(operator.equals(DIVIDE)){
            total = num1 / num2;
        }
        else {
            System.out.println("Error! Invalid input");
            System.exit(0);
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + total);
    }
}
