package com.aseem.week3.day2;

import java.util.Scanner;

public class CountSignedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] userArray = new int[5];
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        for (int i=0; i<userArray.length; i++){
            System.out.println("(" + (i+1) + ") Enter a number: ");
            int number = scanner.nextInt();
            if(number > 0){
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            }else {
                zeroCount++;
            }
        }
        System.out.println("Negative number: " + negativeCount + ", Positive number: "
                + positiveCount + ", Zsero: " + zeroCount);
    }
}
