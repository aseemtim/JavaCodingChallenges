package com.aseem.week4.day1;
// Create a custom class Student with the following attributes: name (String), age (int), and grade (double).
// Implement a Java program that uses an ArrayList to store a list of students and performs the following tasks:

//Create and add several student objects to the ArrayList.
//Find and print the average grade of all students.
//Print the name and age of all students who have a grade higher than 90.

import java.util.ArrayList;

public class StudentMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student("John", 23, 83.3));
        students.add(new Student("Lilith", 27, 93.6));
        students.add(new Student("Tom", 21, 43.3));

        System.out.println("Average grade: " + calculateAvg(students, students.size()));
        printGradeAbove(students, 90);
    }

    public static double calculateSum(ArrayList<Student> students) {
        double sum = 0;
        for (Student student : students) {
            sum += student.getGrade();
        }
        return sum;
    }
    public static double calculateAvg(ArrayList<Student> students, int length) {
        return calculateSum(students) / length;
    }

    public static void printGradeAbove(ArrayList<Student> students, int grade) {
        System.out.println("Students who scored above " + grade + ":");
        for (Student student : students) {
            if(student.getGrade() > grade) {
                System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
            }
        }
    }
}
