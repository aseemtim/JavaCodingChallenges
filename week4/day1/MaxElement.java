package com.aseem.week4.day1;

import java.util.ArrayList;
import java.util.List;

public class MaxElement {
    public static void main(String[] args) {
        List<Integer> userList = new ArrayList<Integer>();
        userList.add(1);
        userList.add(5);
        userList.add(2);
        System.out.println(checkMax(userList));
    }
    public static Integer checkMax(List<Integer> userList) {
        int highest = userList.get(0);
        for(Integer e : userList) {
            if (e > highest) {
                highest = e;
            }
        }
        return highest;
    }
}
