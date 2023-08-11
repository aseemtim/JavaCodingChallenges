package com.aseem.week4.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        HashMap<String, Integer> charMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userString = scanner.nextLine();
        String[] charArr = userString.split("");

        // set key and its value
        for(String word : charArr) {
            if(charMap.containsKey(word)) {
                int value = charMap.get(word);
                charMap.put(word, value + 1);
            } else {
                charMap.put(word, 1);
            }
        }

        // print values in map
        for(Map.Entry<String, Integer> map : charMap.entrySet()) {
            System.out.println(map.getKey() + ": " + map.getValue());
        }
    }
}
