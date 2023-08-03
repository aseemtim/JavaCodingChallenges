package com.aseem.week3.day1;

public class DescendingOrder {
    public static void main(String[] args) {
        int[] userArray = {5,3,2,4};
        int length = userArray.length;
        int[] reversedArray = new int [length];

        for (int i=length-1; i>=0; i--) {
            reversedArray[i] = userArray[i];
            System.out.print(reversedArray[i]);
        }
    }
}
