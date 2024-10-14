package com.snipe.learning.exceptionhandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PersonDetails {
	public static void main (String[] args) {
		String name;
		int age = 0;
		int studentID, employeeID;
				
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println (" Enter the name of student : ");
			name = buffer.readLine ();
			System.out.println (" Enter the age of student : ");
			age = Integer.parseInt(buffer.readLine());
			System.out.println ("Enter the student ID : ");
			studentID = Integer.parseInt (buffer.readLine ());
			Student student = new Student (name, age, studentID);
			student.display();
			
			System.out.println (" Enter the name of employee : ");
			name = buffer.readLine();
			System.out.println (" Enter the age of employee : ");
			age = Integer.parseInt( buffer.readLine() );
			System.out.println (" Enter the employee ID : ");
			employeeID = Integer.parseInt (buffer.readLine() );
			Employee employee = new Employee (name, age, employeeID);
			employee.display();
		} catch (Exception exception) {
			exception.printStackTrace ();
		}
	}
}
