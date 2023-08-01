package com.aseem.day9;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount to withdraw: ");
        int amount = scanner.nextInt();

        int[] result = getDenomination(amount);
        System.out.println("Denominations: ");
        System.out.println("2000: " + result[0]);
        System.out.println("500: " + result[1]);
        System.out.println("100: " + result[2]);

    }
    public static int[] getDenomination(int money) {
        int[] denomination = new int[3];
        denomination[0] = money/2000;
        denomination[1] = (money - (denomination[0] * 2000)) / 500;
        denomination[2] = (money - ((denomination[0] * 2000) + (denomination[1] * 500))) / 100;
        return denomination;
    }
}
