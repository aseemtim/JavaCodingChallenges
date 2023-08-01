package com.aseem.day8;

public class CountLegs {
    public static int animals(int a, int b, int c){
        return (a * 2) + (b * 4) + (c * 4);
    }
    public static void main(String[] args){
        System.out.println("Total legs: " + animals(2,3,5));
    }
}
