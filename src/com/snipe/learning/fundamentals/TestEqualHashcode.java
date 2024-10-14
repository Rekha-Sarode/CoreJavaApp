package com.snipe.learning.fundamentals;

public class TestEqualHashcode {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println("s1 equals s2 : "+s1.equals(s2));  // true
		System.out.println("Hashcode value of s1 : "+s1.hashCode());
		System.out.println("Hashcode value of s2 : "+s2.hashCode());
		String s3 = new String("Hello");   // true
		String s4 = new String("Hello");	// true
		System.out.println("s3 equals s4 : "+s3.equals(s4));
		System.out.println("s1 equals s3 : "+s1.equals(s3));
		System.out.println("Hashcode value of s3 : "+s3.hashCode());
		System.out.println("Hashcode value of s4 : "+s4.hashCode());	// same int value	
	}
}
