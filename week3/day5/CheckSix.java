package com.aseem.week3.day5;

// Given an array of ints, return the number of times that two 6's are next to each other in the array.
// Also count instances where the second "6" is actually a 7.

public class CheckSix {
    public static void main(String[] args) {
        int[] a = {6,6,2};
        int[] b = {6,6,2,6};
        int[] c = {6,7,2,6};

        System.out.println(array667(a));
        System.out.println(array667(b));
        System.out.println(array667(c));
    }

    public static int array667(int[] a){
        int count = 0;
        for (int i=0; i<a.length-1; i++){
            if(a[i] == 6 && (a[i+1]==6 || a[i+1]==7)){
                count++;
            }
        }
        return count;
    }
}
