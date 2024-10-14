package com.snipe.learning.exceptionhandling;

public class Person {	
	protected String name;
	protected int age;
	
	public Person (String name,int age ) {
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.print ("   Name = "+name+"\n   Age = "+age);
	}
}
