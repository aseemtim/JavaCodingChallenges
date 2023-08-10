package com.aseem.week4.day1;

import java.util.ArrayList;
import java.util.List;

public class MergeList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

        arrayList1.add(1);
        arrayList1.add(2);
        arrayList2.add(3);
        arrayList2.add(4);

        for(Integer e : mergeLists(arrayList1, arrayList2)) {
            System.out.println(e);
        }
    }
    public static ArrayList<Integer> mergeLists(ArrayList<Integer> a,  ArrayList<Integer> b){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.addAll(a);
        arrayList.addAll(b);
        return arrayList;
    }
}
