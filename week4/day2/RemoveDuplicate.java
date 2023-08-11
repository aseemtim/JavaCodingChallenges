package com.aseem.week4.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Write a Java program that takes a list of integers, removes duplicate values, and prints the result using a set.
public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> numArr = Arrays.asList(1,3,1,4,3,5);
        Set<Integer> numSet = new HashSet<>(numArr);
        for (Integer num : numSet) {
            System.out.println(num);
        }
    }
}
