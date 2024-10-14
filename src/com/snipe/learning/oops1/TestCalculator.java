package com.snipe.learning.oops1;

class Calculator {
	public int compute(int a, int b) {
		return a+b;
	}
	public int compute(int a,int b, int c) {
		return a+b+c;
	}
	public float compute(int a,float b) {
		return a+b;
	}
}

public class TestCalculator {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println("Addition :: "+calculator.compute(10, 20));
		System.out.println("Addition with float :: "+calculator.compute(20, 10.5f));
		System.out.println("Addition with three values :: "+calculator.compute(10,20,30));
	}
}
