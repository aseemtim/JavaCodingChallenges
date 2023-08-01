package com.aseem.day8;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range of the fibonacci numbers: ");
        int range = scanner.nextInt();

        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        for(int i = 0; i < range; i++){
            System.out.println(num1);
            // we need n3 to store the value of n1 otherwise the previous value of n1 will be lost
            num3 = num1;
            num1 = num2;
            num2 = num2 + num3;
        }
    }
}
