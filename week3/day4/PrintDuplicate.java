package com.aseem.week3.day4;

public class PrintDuplicate {
    public static void main(String[] args) {
        // Implementation with map would be the best but here we are.

        int[] arr = {1,8,4,5,8,7,4};
        String duplicates = "";

        for (int i=0; i<arr.length-1; i++) {
            for (int j=i+1; j<arr.length; j++){
                if(arr[j] == arr[i]){
                    // save the duplicated element to a string
                    if(!duplicates.contains(""+arr[i])){
                        duplicates+=""+arr[i]; // save the int element as string
                    }
                }
            }
        }
        // split the duplicate String to an array of char to print the elements.
        char[] duplicatedChar = duplicates.toCharArray();
        for (int i=0; i<duplicatedChar.length; i++) {
            System.out.println(duplicatedChar[i]);
        }
    }
}
