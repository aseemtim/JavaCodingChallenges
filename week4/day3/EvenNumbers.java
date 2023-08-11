package com.aseem.week4.day3;

import java.util.ArrayList;
import java.util.Iterator;

public class EvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> userList = new ArrayList<>();
        userList.add(1);
        userList.add(2);
        userList.add(3);
        userList.add(4);
        for(Iterator<Integer> i = userList.iterator(); i.hasNext();) {
            System.out.println(i);
        }
        deleteEven(userList);
        System.out.println(userList);
    }
    public static void deleteEven(ArrayList<Integer> numList) {
        // normal for(type variableName : list) does not work when modifying elements of a collection while iterating.
        for(Iterator<Integer> i = numList.iterator(); i.hasNext();) {
            Integer num = i.next();
            if (num % 2 == 0) {
                i.remove();
            }
        }
    }
}
