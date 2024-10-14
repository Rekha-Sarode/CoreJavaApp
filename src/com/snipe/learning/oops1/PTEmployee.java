package com.snipe.learning.oops1;

public class PTEmployee extends Employee{
	int hrs;
	
	public PTEmployee(String firstName, String lastName, String empId, String 
	desig, Double salary) {
		super(firstName, lastName, empId, desig, salary);
		this.hrs =10;
	}
	
	public void display() {
		System.out.println(this.firstName + " :: "+ this.lastName+" :: "
				+this.empId + " :: "+ this.desig + " :: "+ this.salary+" :: "+this.hrs);
	}
}
