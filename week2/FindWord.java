package com.aseem.day8;

import java.util.Scanner;

public class FindWord {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String userInput = scanner.nextLine();
        String[] stringArray = userInput.split(" ");

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Word number " + num + " -> "+ stringArray[num - 1]);
        System.out.println("The second to the last word -> " + stringArray[stringArray.length - 2]);
    }
}
