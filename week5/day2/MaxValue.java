package com.aseem.week5;

import java.util.HashMap;

public class MaxValue {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 6);
        map.put("B", 1);
        map.put("C", 7);
        map.put("D", 2);
        int max = 0;
        String keyWithHighestValue = "";
        for (String key : map.keySet()) {
            if(map.get(key) > max) {
                max = map.get(key);
                keyWithHighestValue = key;
            }
        }
        System.out.println("Key with maximum value: " + keyWithHighestValue);
    }
}