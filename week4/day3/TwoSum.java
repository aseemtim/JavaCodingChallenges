package com.aseem.week4.day3;

import java.util.HashMap;
import java.util.Map;

//Given an array of integers, find two numbers that add up to a specific target sum.
// Return the indices of the two numbers.
// For example, if the input is [2, 7, 11, 15] and the target is 9, the function should return [0, 1].
public class TwoSum {
    public static void main(String[] args) {
        // create a hashmap
        // iterate over the array using traditional for loop -> O(n)
            // if target - current element is not in the map, save the current element in the map and its index
            // if target - current element is in the map, print the map value of the expression and the current index
        // Time complexity -> O(n) -> loops through the array only once.

        Map<Integer, Integer> map = new HashMap<>();
        int[] num = {7,11,15,2};
        int target = 9;
        for(int i=0; i<num.length; i++) {
            if(map.containsKey(target - num[i])) {
                System.out.println(map.get(target - num[i]) + ", " + i );
                break;
            }
            map.put(num[i], i);
        }
    }
}
