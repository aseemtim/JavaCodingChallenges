package com.aseem.week3.day5;

//Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.

public class CheckTen {
    public static void main(String[] args) {
        System.out.println(makes(9, 10));
        System.out.println(makes(9, 9));
        System.out.println(makes(1, 9));
    }
    public static boolean makes(int a, int b){
        return (a == 10 || b == 10 || a+b == 10);
    }
}
