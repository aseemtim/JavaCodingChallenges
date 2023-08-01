package com.aseem.day7;

public class LargestAndSmallest {
    public static void main(String[] args){
        int[] newArray = {2,5,7,1,4};
        int largest = newArray[0];
        int smallest = newArray[0];

        for (int i=0; i<newArray.length; i++) {
            if(newArray[i] > largest) {
                largest = newArray[i];
            }
            if(newArray[i] < smallest) {
                smallest = newArray[i];
            }
        }

        System.out.println("Largest: " + largest + " Smallest: " + smallest);
    }
}
