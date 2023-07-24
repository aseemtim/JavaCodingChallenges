package com.aseem.day2;

public class BillCalculation {
    public static void main(String[] args) {
        int initialAmount = 30;
        int taxes = 15;
        int tip = 10;

        int total = initialAmount + taxes + tip;

        System.out.println("You Bill:");
        System.out.println("Initial Amount: " + initialAmount);
        System.out.println("Taxes: " + taxes);
        System.out.println("Tip: " + tip);
        System.out.println();
        System.out.println("Total: " + total);
    }
}
