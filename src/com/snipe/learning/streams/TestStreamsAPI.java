package com.snipe.learning.streams;

import java.util.*;
import java.util.stream.*;

public class TestStreamsAPI {
	public static void main(String[] args) {
		// create a list of integers
		List<Integer> number = Arrays.asList(2, 3, 4, 5); 

		// demonstration of map method
		List<Integer> squareList = number.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println("squareList : "+squareList);

		// create a list of String
		List<String> names = Arrays.asList("Reflection", "Collection", "Stream");

		// demonstration of filter method
		List<String> filterNames	= names.stream().filter(s -> s.startsWith("R")).collect(Collectors.toList());
		System.out.println("filterNames : "+filterNames);

		// demonstration of sorted method
		List<String> sortNames = names.stream().sorted().collect(Collectors.toList());
		System.out.println("sortNames : "+sortNames);
		
		// collect method returns a set
		Set<Integer> squareSet = number.stream().map(x -> x * x).collect(Collectors.toSet());
		System.out.println("squareSet : "+squareSet);

		// demonstration of forEach method
		System.out.println("cube nos : ");
		number.stream().map(x -> x * x * x).forEach(y -> System.out.println(y));

		// demonstration of reduce method
		int sumOfEvenNos = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
		System.out.println("sum of even nos : "+sumOfEvenNos);

		ArrayList<Integer> noList = new ArrayList<Integer>();
		noList.add(40);
		noList.add(25);
		noList.add(30);
		noList.add(25);
		noList.add(35);
		System.out.println("noList : "+noList);
		
		Integer min = noList.stream().min((i1,i2)->-i1.compareTo(i2)).get();;
		System.out.println("min : "+min);

		Integer max = noList.stream().max((i1,i2)->-i1.compareTo(i2)).get();;
		System.out.println("max :"+max); 
		
		List<Integer> sortNo = noList.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("sortNo : "+sortNo);
		
		List<Integer> revsortNo = noList.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println("revsortNo : "+revsortNo);
		
		noList.stream().filter(n-> {System.out.println("Filtering current element : "+n); return n%2 == 0;})
			.map(n-> {System.out.println("Mapping current element : "+n); return n*n*n;})
			.sorted()
			.forEach(System.out::println);
		
		Stream<Integer> i = Stream.of(9,99,999,9999);
		i.forEach(System.out::println);
	}
}
