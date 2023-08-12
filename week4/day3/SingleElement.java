package com.aseem.week4.day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleElement {
    public static void main(String[] args) {
        // create a hashmap
        // iterate through the list - O(n)
            // make the elements key and its occurrence values
        // print the key that has value 1 while iterating over hashmap keys - O(n)
        // Time Complexity - 2n -> n
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(7);
        list.add(2);
        list.add(3);

        for(Integer i : list) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
                continue;
            }
            map.put(i, 1);
        }
        for(int key : map.keySet()) {
            if(map.get(key) == 1) {
                System.out.println(key);
            }
        }
    }
}
