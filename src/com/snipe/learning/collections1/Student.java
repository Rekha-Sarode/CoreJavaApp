package com.snipe.learning.collections1;

import java.util.Comparator;

public class Student implements Comparable<Student> {
	int rollNo;
	String name;
	int marks;
	
	public Student(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		if(rollNo > o.rollNo)
			return 1;
		else if(rollNo < o.rollNo)
			return -1;
		return 0;
	}
}

class NameComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
}

class MarksComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		if(o1.marks > o2.marks)
			return 1;
		else if(o1.marks < o2.marks)
			return -1;
		return 0;
	}
}
