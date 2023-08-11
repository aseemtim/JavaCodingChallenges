package com.aseem.week4.day2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// Write a Java program that takes a sentence as input and prints the frequency of each word using a map.
public class WordOccurence {
    public static void main(String[] args) {
        HashMap<String, Integer> wordMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.println(sentence);
        String[] sentenceArr = sentence.split(" ");

        // set key and its value
        for(String word : sentenceArr) {
            if(wordMap.containsKey(word)) {
                int value = wordMap.get(word);
                wordMap.put(word, value + 1);
            } else {
                wordMap.put(word, 1);
            }
        }

        // print values in map
        for(Map.Entry<String, Integer> map : wordMap.entrySet()) {
            System.out.println(map.getKey() + ": " + map.getValue());
        }
    }
}
