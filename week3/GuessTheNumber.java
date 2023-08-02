package com.aseem.week3.day1;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter a lower bound and a upperbound (like: 2 8)");
        String[] bounds = scanner.nextLine().split(" ");

        int lowerBound = Integer.valueOf(bounds[0]);
        int upperBound = Integer.valueOf(bounds[1]);
        System.out.println(lowerBound);
        System.out.println(upperBound);
        int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        System.out.println("The secret number has been generated.");

        int count = 1;
        boolean isEqual = false;
        while(count <=5) {
            System.out.println("Enter your guess: ");
            int guess = scanner.nextInt();
            if (guess > secretNumber) {
                System.out.println("Your guess is too high");
            }
            else if(guess < secretNumber) {
                System.out.println("Your guess is too low");
            }
            else {
                isEqual = true;
                break;
            }
            count++;
        }
        if(isEqual){
            System.out.println("You guessed right.");
            System.out.println("No of tries: " + count);
        }else{
            System.out.println("You used all your chances.");
            System.out.println("Correct answer: " + secretNumber);
        }
    }
}
