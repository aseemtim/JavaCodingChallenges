package com.aseem.week3.day2;

public class SearchElement {
    public static void main(String[] args) {
        int[] userArray = {1,9,4,8,5,7};
        int numberToSearch = 4;
        for(int i=0; i<userArray.length; i++) {
            if(userArray[i] == numberToSearch){
                System.out.println(i);
                return;
            }
        }
        System.out.println("Error! No such number in the array");
    }
}
