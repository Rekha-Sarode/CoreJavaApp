package com.snipe.learning.oops;

// display employee information using class and object(default constructor)

import java.util.Scanner;

class Employee {
	// attributes or data members
	String firstName;
	String lastName;
	String empId;
	double salary;
	String desig;
	
	public Employee() { // default constructor
	}
	
	/**
	* this method used to read the information about the employees
	*/
	public void read() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the first name");
		this.firstName = scanner.next();
		System.out.println("please enter the last name");
		this.lastName = scanner.next();
		System.out.println("please enter the empId");
		this.empId = scanner.next();
		System.out.println("please enter the Salary");
		this.salary = scanner.nextDouble();
		System.out.println("please enter the designation");
		this.desig = scanner.next();
		scanner.close();
	}
	
	/**
	* this method used to display the employee information
	*/
	public void display() {
		System.out.println(this.firstName + " :: " + this.lastName + " :: " 
				+ this.empId + " :: " + this.salary + " :: "+ 
				this.desig);
	}
}

public class TestOOPS {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.read();
		employee.display();
	}
}
