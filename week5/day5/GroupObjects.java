package com.takeo.week5.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupObjects {

	public static void main(String[] args) {
		
		List<Person> person = new ArrayList<>();
		person.add(new Person("John", 23));
		person.add(new Person("Jay", 25));
		person.add(new Person("Lilith", 23));
		person.add(new Person("Ana", 25));
		person.add(new Person("Tom", 21));
		
		Map<Integer, List<Person>> groupedMap = new HashMap<>();
		
		for(Person element : person) {
			List<Person> people = groupedMap.get(element.getAge());
			if(people == null) {
				people = new ArrayList<>();
				groupedMap.put(element.getAge(), people);
			}
			// use of assignment by reference
			people.add(element);
			
		}
//		for(Person element : person) {
//			if(groupedMap.containsKey(element.getAge())) {
//				List<Person> value = groupedMap.get(element.getAge());
//				value.add(element);
//				groupedMap.put(element.getAge(), value);
//			} else {
//				List<Person> groupList = new ArrayList<>();
//				groupList.add(element);
//				groupedMap.put(element.getAge(), groupList);
//			}
//		}
		
		//Using Stream
		//Map<Integer, List<Person>> groupedMap = person.stream().collect(Collectors.groupingBy(w -> w.getAge()));
		
		for(Integer age: groupedMap.keySet()) {
			System.out.println(groupedMap.get(age));
		}
	}

}

