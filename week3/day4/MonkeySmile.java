package com.aseem.week3.day4;

public class MonkeySmile {
    public static void main(String[] args) {
        System.out.println(monkeyTrouble(false, false));
    }
    public static boolean monkeyTrouble(boolean a, boolean b){
        if(a && b) {
            return true;
        }else if (!a && !b){
            return true;
        }else {
            return false;
        }
        // or the simplest, just return a == b
    }
}
