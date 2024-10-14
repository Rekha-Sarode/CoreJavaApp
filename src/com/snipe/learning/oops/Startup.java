package com.snipe.learning.oops;

/* Purpose : Create an application program that consists of 2 classes, 
  a startup class and a second class that prints out the values of at least 
  3 instance variables that are initialized in one method and printed from another. 
  The initialization method should have two forms. 
  One of them will have no arguments and the other 3 arguments corresponding 
  to the data types of the 3 instance variables. The second class should also contain 
  a "class variable" of one of the 8 primitive data types (you choose). 
  Create 2 instances of the second class. 
  Using one instance, set the class variable to some value and, 
  using the second instance, print that value. 
  Also, using either or both of the 2 instances, 
  call the methods that set and print the 3 instance variables.
*/

import java.io.*;

/**
* A helper class 
*/
class SecondClass {
	private String name;
	private String address;
	private int age;
	private static String cityName;
	
	SecondClass () {
		name = "Rekha";
		address = "Pune";
		age = 45;
	}
	
	SecondClass (String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	public void setCityName (String cityName) {
		this.cityName = cityName;
	}
	
	public void getCityName() {
		System.out.println ("City Name = " + cityName);
	}
	
	public void display() {
		System.out.println ("\t Name = " + name + "\n\t Age = " + age
				+ "\n\t Address = " + address);
	}
}

public class Startup {
	public static void main (String[] args) throws IOException {
		String name, address, cityName;
		int age;
		BufferedReader buffer = new BufferedReader (new InputStreamReader (System.in));
		
		System.out.print ("Enter the name :");
		name = buffer.readLine ();
		System.out.print ("Enter the age :");
		age = Integer.parseInt (buffer.readLine ());
		System.out.print ("Enter the address :");
		address = buffer.readLine ();
		System.out.print ("Enter the city name :");
		cityName = buffer.readLine();
		
		SecondClass firstInstance = new SecondClass();
		firstInstance.display();
		SecondClass secondInstance = new SecondClass (name, address, age);
		secondInstance.display();
		firstInstance.setCityName (cityName);
		secondInstance.getCityName ();
	}
}
