package com.aseem.week3.day5;

public class CheckSequence {
    public static void main(String[] args) {
        int[] a = {1,1,2,3,1};
        int[] b = {1,1,2,4,1};
        int[] c = {1,1,2,1,2,3};

        System.out.println(array123(a));
        System.out.println(array123(b));
        System.out.println(array123(c));
    }

    public static boolean array123(int[] a){
        for (int i=0; i<a.length-2; i++){
            if(a[i] == 1 && a[i+1]==2 && a[i+2]==3){
                return true;
            }
        }
        return false;
    }
}
