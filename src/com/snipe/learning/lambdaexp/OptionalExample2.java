package com.snipe.learning.lambdaexp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class OptionalExample2 {
	public static void main(String[] args) {  
		List<String> fruitsList = new ArrayList<>();
		fruitsList.add("Banana");
		fruitsList.add("Apple");
		fruitsList.add("Mango");
		Optional<List<String>> opt = Optional.of(fruitsList);
		opt.ifPresent(System.out::println);
		
		Map<String, Integer> fruitsMap = new HashMap<>();
		fruitsMap.put("Banana", 12);
		fruitsMap.put("Apple", 10);
		fruitsMap.put("Mango", 6);
		Optional<Integer> opt1 = Optional.of(fruitsMap.get("Mango"));
		opt1.ifPresent(no -> System.out.println("Number of Mango : "+no));
		
		Set<String> fruitsSet = new HashSet<>();
		fruitsSet.add("Banana");
		fruitsSet.add("Apple");
		fruitsSet.add("Mango");
		String targetFruit = "Mango";
		Optional<String> opt2 = fruitsSet.stream().filter(f -> f.equalsIgnoreCase(targetFruit)).findFirst();
		opt2.ifPresent(fruit -> System.out.println("Found fruit : "+fruit));
	}
}
