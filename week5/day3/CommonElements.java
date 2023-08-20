package com.takeo.week5.day3;

import java.util.HashSet;
import java.util.List;

public class CommonElements {
//Exercise 2 : Write a program that takes two lists of integers as input and finds the common elements between them.
//Ex: List<Integer> list1 = List.of(1,4,6,3,7,8);
//    List<Integer> list1 = List.of(2,5,8,2,5,6);
//
//output : common elements in two list = 6,8
	public static void main(String[] args) {
		
		List<Integer> list1 = List.of(1,4,6,3,7,8);
	    List<Integer> list2 = List.of(2,5,8,2,5,6);
		
		HashSet<Integer> set = new HashSet<>(list1);
		HashSet<Integer> commonSet = new HashSet<>();
		
		for(Integer element : list2) {
			if(!commonSet.contains(element)) {
				if(set.contains(element)) {
					commonSet.add(element);
				}
			}
		}
		
		System.out.println(commonSet);
	}

}
