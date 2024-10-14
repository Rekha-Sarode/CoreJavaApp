package com.snipe.learning.oops1;

public class Employee extends Person {
	String empId;
	String desig;
	Double salary;
	
	public Employee(String firstName, String lastName,String empId, String 
	desig, Double salary) {
		super(firstName, lastName);
		this.empId= empId;
		this.desig = desig;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println(this.firstName + " :: "+this.lastName+" :: "
				+this.empId + ":: "+ this.desig + " :: "+this.salary);
	}
}
