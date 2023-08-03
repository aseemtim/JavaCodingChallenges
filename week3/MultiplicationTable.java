package com.aseem.week3.day1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int userInput = scanner.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(userInput + " * " + i + " = " + userInput * i);
        }
    }
}
