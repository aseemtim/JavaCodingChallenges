package com.aseem.day5;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.println("Enter the rate of interest: ");
        double rate = scanner.nextDouble();
        System.out.println("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * time * rate) / 100;

        System.out.println("Simple Interest: " + simpleInterest);
    }
}
