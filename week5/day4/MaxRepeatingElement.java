package week5day4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxRepeatingElement {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(3,7,5,7,9,5,7);
		Map<Integer, Integer> map = new HashMap<>();
		int max = 0;
		int requiredKey = 0;
		
		for (Integer element : numbers) {
			if (map.containsKey(element)) {
				Integer value = map.get(element);
				map.put(element, value+1);
			} else {
				map.put(element, 1);
			}
		}
		
		for (Integer key : map.keySet()) {
			int value = map.get(key);
			if(value  > max ){
				max = value;
				requiredKey = key; 
			}
		}
		
		System.out.println(requiredKey);
	}
}
