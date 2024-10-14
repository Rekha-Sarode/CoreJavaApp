package com.snipe.learning.fundamentals;

public class TestStatic {
	static int count;
	static {
		count = 10;
	}
	public static void main(String []args) {
		System.out.println("Value of count is : "+count);
	}
}
