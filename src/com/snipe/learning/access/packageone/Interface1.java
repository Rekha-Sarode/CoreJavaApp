package com.snipe.learning.access.packageone;

public interface Interface1 {
	int val = 10;
	default void print() {
		System.out.println("default method");
	}
	default void print1() {
		System.out.println("default method1");
	}
}
