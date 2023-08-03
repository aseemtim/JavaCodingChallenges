package com.aseem.week3.day2;

import java.util.Scanner;

public class UseOfSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String[] userInput = scanner.nextLine().split(" ");

        for (int i=0; i<userInput.length; i++) {
            System.out.println(userInput[i]);
        }
    }
}
