package com.snipe.learning.java11features;

import java.util.function.Predicate;

public class TestFeatures {

	public static void main(String[] args) {
		// Old syntax with explicit type declaration 
		Predicate<Integer> oldSyntax = (Integer number) -> number > 0;
		System.out.println(oldSyntax.test(5)); // true

		// New syntax with var keyword
		Predicate<Integer> newSyntax = (var number) -> number > 0;
		System.out.println(newSyntax.test(5));  // true
	}
}
