package com.aseem.day5;

import java.util.Scanner;

public class GradeCalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the marks obtained: ");
        int marksObtained = scanner.nextInt();
        if (marksObtained > 100 || marksObtained < 0){
            System.out.println("Error: Invalid marks!");
        } else if (marksObtained >= 90) {
            System.out.println("Grade: A");
        } else if (marksObtained >= 80) {
            System.out.println("Grade: B");
        } else if (marksObtained >= 70) {
            System.out.println("Grade: C");
        } else if (marksObtained >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        scanner.close();
    }
}
