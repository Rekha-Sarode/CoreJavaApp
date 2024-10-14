package com.snipe.learning.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import javax.print.DocFlavor.STRING;

public class TestMethodRef {
	public static void main(String[] args) {
		System.out.println("Reference to a static method");
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		//Lambda exp
		numbers.forEach(n -> System.out.println(n));
		//Method Ref
		numbers.forEach(System.out::println);
		
		System.out.println("Reference to an instance method");
		String str = "Hello World!";
		//Lambda exp
		str.chars().forEach(ch -> System.out.println((char)ch));
		//Method Ref
		str.chars().forEach(System.out::println);
		
		System.out.println("Reference to an instance method of an arbitrary object of a particular type");
		List<String> names = Arrays.asList("Ram","Gopal","Ganesh");
		//Lambda exp
		names.sort((s1,s2) -> s1.compareToIgnoreCase(s2));
		names.forEach(n -> System.out.println(n));
		//Method Ref
		names.sort(String::compareToIgnoreCase);
		names.forEach(System.out::println);
		
		System.out.println("Reference to a constructor");
		Supplier<List<String>> listsupplier = ArrayList::new;
		List<String> list = listsupplier.get();
		list.add("Apple");
		list.add("Banana");
		System.out.println("list : "+list);	
	}
}
