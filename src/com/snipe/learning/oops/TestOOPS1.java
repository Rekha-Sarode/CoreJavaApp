package com.snipe.learning.oops;

//  display employee information using class and object(parameterized constructor)

import java.util.Scanner;

class Employee1 {
	// attributes or data members or instance variables
	private String firstName;
	private String lastName;
	private String empId;
	private double salary;
	private String desig;
	
	// parametrized constructor
	public Employee1(String firstName, String lastName, String empId, double salary, String design) {  
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = empId;
		this.salary = salary;
		this.desig = design;
	}
	
	/**
	* this method used to display the employee information
	*/
	public void display() {
		System.out.println(this.firstName + " :: " + this.lastName + " :: " + this.empId + " :: " 
				+ this.salary + " :: "+ this.desig);
	}
}

public class TestOOPS1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the first name");
		String firstName = scanner.next();
		System.out.println("please enter the last name");
		String lastName = scanner.next();
		System.out.println("please enter the empId");
		String empId = scanner.next();
		System.out.println("please enter the Salary");
		double salary = scanner.nextDouble();
		System.out.println("please enter the designation");
		String desig = scanner.next();
		scanner.close();
		
		Employee1 employee = new Employee1(firstName, lastName, empId, salary, desig);
		employee.display();
	}
}
