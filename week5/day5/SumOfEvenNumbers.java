package com.takeo.week5.day5;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenNumbers {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(2,3,4,5,6);
		Integer sum = 0;
		for(Integer number : numbers) {
			if (number % 2 == 0) {
				sum+= number;
			}
		}
		
		//Java 8 feature(stream)
		//sum = numbers.stream().filter(e -> e % 2 == 0).reduce(0, (x,y) -> x + y);
		
		System.out.println(sum);
	}
}
