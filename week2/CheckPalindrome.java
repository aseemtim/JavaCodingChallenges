package com.aseem.day8;
import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word to check for palindrome: ");
        String userInput = scanner.nextLine();
        char[] charArray = userInput.toCharArray();
        int j = charArray.length - 1;

        for(int i=0; i<charArray.length/2; i++) {
            //check for first and last item
            if(charArray[i] != charArray[j]) {
                System.out.println("The word is not palindrome.");
                return;
            }
            // i increases in every iteration but j needs to be handled separately
            j--;
        }
        System.out.println("The word is palindrome.");

    }
}
