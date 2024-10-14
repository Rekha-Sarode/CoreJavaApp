package com.snipe.learning.collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestComparator {
	public static void main(String [] args) {
		List<Student> arrStud = new ArrayList<Student>();
		arrStud.add(new Student(2,"Raj",99));
		arrStud.add(new Student(1,"Aniket",98));
		arrStud.add(new Student(3,"Manas",97));		
		System.out.println("ArrayList : ");
		for(Student std : arrStud)
			System.out.println(std);
		
		System.out.println("ArrayList sorted by rollNo : ");
		Collections.sort(arrStud);
		for(Student std : arrStud)
			System.out.println(std);
		
		System.out.println("ArrayList sorted by name : ");
		NameComparator nameComp = new NameComparator();
		Collections.sort(arrStud, nameComp);
		for(Student std : arrStud)
			System.out.println(std);
		
		System.out.println("ArrayList sorted by marks : ");
		MarksComparator marksComp = new MarksComparator();
		Collections.sort(arrStud, marksComp);
		for(Student std : arrStud)
			System.out.println(std);
	}
}
