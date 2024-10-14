package com.snipe.learning.collections1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class TestLinkedHashSet {
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
		
		// LinkedHashSet of Integers
		Set<Integer> lhs = new LinkedHashSet<Integer>(arr);
		System.out.println("LinkedHashSet of integer values : "+lhs);
		
		// LinkedHashSet of Strings
		Set<String> lhsStr = new LinkedHashSet<String>();
		lhsStr.add("Raj");
		lhsStr.add("Rekha");
		lhsStr.add("Rupesh");
		lhsStr.add("Pravin");
		lhsStr.add("Saroj");
		System.out.println("\nLinkedHashSet of string values : "+lhsStr);
		
		// LinkedHashSet of Employee
		Set<Employee> lhsEmp = new LinkedHashSet<Employee>();
		lhsEmp.add(new Employee("A3","Raj",10000.0f));
		lhsEmp.add(new Employee("A1","Rekha",20000.0f));
		lhsEmp.add(new Employee("A2","Rupesh",30000.0f));
		System.out.println("\nLinkedHashSet of Employee : ");
		for(Employee emp : lhsEmp)
			System.out.println(emp);
	}
}
