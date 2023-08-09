package com.aseem.week3.day5;

public class CheckSum {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {3, 1,2};
        int[] c = {3,2,2};

        System.out.println(twoAsOne(a));
        System.out.println(twoAsOne(b));
        System.out.println(twoAsOne(c));
    }

    public static boolean twoAsOne(int[] arr) {
        if (arr[0] + arr[1] == arr[2]) {
            return true;
        }
        if (arr[1] + arr[2] == arr[0]) {
            return true;
        }
        if (arr[0] + arr[2] == arr[2]) {
            return true;
        }
        return false;
    }
}
