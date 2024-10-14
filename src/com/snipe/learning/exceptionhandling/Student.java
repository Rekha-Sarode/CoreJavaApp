package com.snipe.learning.exceptionhandling;

public class Student extends Person {
	int studentID;
	
	Student (String name, int age, int studentID) {
		super (name, age);
		this.studentID = studentID;
	}

	public void display() {
		System.out.println ("********** Student Details ***********");
		super.display ();
		System.out.println ("\n   Student ID = " + studentID);
	}
}
