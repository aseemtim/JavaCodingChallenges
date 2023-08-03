package com.aseem.week3.day2;

import java.util.Scanner;

public class CorrectInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Enter either 1 or 2: ");
        int userInput = scanner.nextInt();
        while(userInput!=1 && userInput!=2) {
            System.out.println("Please enter correct value: ");
            userInput = scanner.nextInt();
        }
        System.out.println("Thank you for your input!");
    }
}
