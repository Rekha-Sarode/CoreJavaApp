package com.snipe.learning.collections1;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.List;
import java.util.Set;

public class TestTreeSet {
	public static void main(String [] args){
		// ArrayList of Integers
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(20);
		arr.add(10);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.add(30);
		arr.add(50);
		System.out.println("ArrayList of integer values : "+arr);	
		
		// TreeSet of Integers
		Set<Integer> lhs = new TreeSet<Integer>(arr);
		System.out.println("TreeSet of integer values : "+lhs);
		
		// TreeSet of Strings
		Set<String> lhsStr = new TreeSet<String>();
		lhsStr.add("Raj");
		lhsStr.add("Rekha");
		lhsStr.add("Rupesh");
		lhsStr.add("Pravin");
		lhsStr.add("Saroj");
		System.out.println("\nTreeSet of string values : "+lhsStr);
		
		// TreeSet of Employee gives ClassCastException as it needs Employee to implement Comparable
		Set<Employee> lhsEmp = new TreeSet<Employee>();
		lhsEmp.add(new Employee("A3","Raj",10000.0f));
		lhsEmp.add(new Employee("A1","Rekha",20000.0f));
		lhsEmp.add(new Employee("A2","Rupesh",30000.0f));
		System.out.println("\nTreeSet of Employee : ");
		for(Employee emp : lhsEmp)
			System.out.println(emp);
	}
}
