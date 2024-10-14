package com.snipe.learning.exceptionhandling;

public class Employee extends Person {
	int employeeID;
	
	Employee (String name, int age, int employeeID) {
		super (name, age);
		this.employeeID = employeeID;
	}
	
	public void display() {
		System.out.println ("********** Employee Details ***********");
		super.display ();
		System.out.println ("\n   Employee ID = " + employeeID);
	}
}
