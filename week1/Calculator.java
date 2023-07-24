package com.aseem.day2;

public class Calculator {
    public static void main(String[] args) {
        // implementation of calculator logic
        int num1 = 12;
        int num2 = 15;

        int add = num1 + num2;
        int subtract = num2 - num1;
        int multiply = num1 * num2;
        int divide = num1 / num2;

        System.out.println(num1 + " + " + num2 + " = " + add);
        System.out.println(num1 + " - " + num2 + " = " + subtract);
        System.out.println(num1 + " * " + num2 + " = " + multiply);
        System.out.println(num1 + " / " + num2 + " = " + divide);
    }
}
