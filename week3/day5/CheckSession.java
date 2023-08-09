package com.aseem.week3.day5;

public class CheckSession {
    public static void main(String[] args) {
        System.out.println(session(6, 8));
        System.out.println(session(3, 8));
        System.out.println(session(20, 6));
    }

    public static int session(int a, int b) {
        if (a < 5 || b < 5) {
            return 0;
        }
        if (a > b*2 || b > a*2) {
            return 2;
        }
        if (a >= 5 && b >= 5) {
            return 1;
        }
        return -1;
    }
}
