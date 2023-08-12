package com.aseem.week4.day3;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(5);
        reverse(list);
        System.out.println(list);
    }
    public static void reverse(List<Integer> list) {
        int end = list.size() - 1;
        for(int i=0; i<list.size()/2; i++) {
            Integer temp = list.get(i);
            // front of the list
            list.set(i, list.get(end-i));
            //back of the list
            list.set(end-i, temp);
        }
    }
}
