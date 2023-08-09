package com.aseem.week3.day5;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzString("fig"));
        System.out.println(fizzString("dib"));
        System.out.println(fizzString("fib"));
    }

    public static String fizzString(String a) {
        char[] charArray = a.toCharArray();
        if (charArray[0] == 'f' && charArray[charArray.length-1]=='b'){
            return "FizzBuzz";
        }
        if (charArray[0]=='f') {
           return "Fizz";
        }
        if (charArray[charArray.length-1]=='b') {
           return "Buzz";
        }
        return "-1";
    }
}
