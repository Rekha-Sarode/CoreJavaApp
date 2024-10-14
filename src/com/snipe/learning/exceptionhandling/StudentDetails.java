package com.snipe.learning.exceptionhandling;

public class StudentDetails {
	private String name;
	private int age, numberOfSubjects;
	private String subjects [] = new String [numberOfSubjects];
	private int marks [] = new int[numberOfSubjects];

	public String getName () {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}

	public int getAge () {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public int getNumberOfSubjects () {
		return numberOfSubjects;
	}
	public void setNumberOfSubjects (int numberOfSubjects) {
		this.numberOfSubjects = numberOfSubjects;
	}

	public String [] getSubjects() {
		return subjects;
	}
	public void setSubjects (String[] subjects) {
		this.subjects = subjects;
	}

	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
}
