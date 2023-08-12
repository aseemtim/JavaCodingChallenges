package com.aseem.week4.day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
// For example, if the input is [3, 0, 1], the missing number is 2.
public class FindMissing {
    public static void main(String[] args) {
        //make a hashmap from 0 to size of the array + 1 (since 1 element will be missing in the array) -> O(n)
        // iterate over array -> O(n)
            // check the index as the key, if found remove it from the map
        // after the iteration, only the missing element will remain in the map
        // Time complexity O(n) -> 2n -> n
        Map<Integer, Boolean> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(0);
        list.add(4);
        list.add(1);
        list.add(5);

        // list is missing one element
        for(int i=0; i<=list.size(); i++) {
            map.put(i, true);
        }
        for(Integer element : list) {
            if(map.containsKey(element)) {
                map.remove(element);
            }
        }
        // get whatever is remaining
        System.out.println(map.entrySet().iterator().next().getKey());
    }
}
