package com.aseem.week4.day2;

import java.util.HashMap;
import java.util.Map;
//Create a simple phonebook using a map to store names and phone numbers. Allow the user to add, search for, and remove entries.
public class PhoneBook {
    // question is vague about key type
    // searching with names is easier for users, that's why name is the key here.
    private static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        addEntry("John", 226226226);
        addEntry("Lilith", 949598495);
        addEntry("Tom", 349349349);
        printAll();
        searchEntry("Lilith");
        deleteEntry("Tom");
        printAll();
    }

    public static void addEntry(String name, int number) {
        if(map.containsKey(name)) {
            System.out.println("The name already exists.");
            return;
        }
        map.put(name, number);
        System.out.println("User " + name + " added successfully.");
    }

    public static void searchEntry(String name) {
        if(map.containsKey(name)) {
            System.out.println("User Found!");
            System.out.println(name + ", " + map.get(name));
        }
    }

    public static void deleteEntry(String name) {
        if(map.containsKey(name)) {
            map.remove(name);
            System.out.println("User deleted successfully!");
        } else {
            System.out.println("No such user found!");
        }
    }

    public static void printAll() {
        for(Map.Entry<String, Integer> values: map.entrySet()) {
            System.out.println(values.getKey() + " " + values.getValue());
        }
    }
}
