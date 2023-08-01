package com.aseem.day9;

import java.util.Scanner;

public class HourToSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer hours: ");
        int hour = scanner.nextInt();

        //System.out.println("Total number of seconds: " + hour * 3600);
        System.out.println("Total number of seconds: " + convert(hour));

    }
    public static int convert(int h) {
        return h * 3600;
    }
}
