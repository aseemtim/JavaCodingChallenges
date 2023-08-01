package com.aseem.day8;

public class SwapNumbers {
    public static void main(String[] args) {
        int x = 4;
        int y = 5;

        // swapping values
        int temp = x;
        x = y;
        y = temp;

        // swapping without a third variable
        // x = (x+y) - x;
        // y = (x+y) - y

        System.out.println("X: " + x + " Y: " + y);
    }
}
