package com.aseem.week3.day1;

public class CheckAscending {
    public static void main(String[] args) {
        int[] newArray = {1,3,4,3};

        for (int i=0; i<newArray.length-1; i++) {
            if(newArray[i] > newArray[i+1]) {
                System.out.println("Not sorted");
                return;
            }
        }
        System.out.println("Sorted");
    }
}
