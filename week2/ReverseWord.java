package com.aseem.day7;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String userInput = scanner.nextLine();
        char[] inputArray = userInput.toCharArray();
        String reversed = "";

        for(int i=userInput.length() - 1; i>=0; i--) {
            reversed += inputArray[i];
        }

        System.out.println("Reverse of " + userInput + ": " + reversed);
    }
}
