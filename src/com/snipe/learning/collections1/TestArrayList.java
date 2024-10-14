package com.snipe.learning.collections1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {
	public static void main(String [] args){
		int oldCapacity = 10;
		int newCapacity = oldCapacity + (oldCapacity>>1);
		System.out.println("newCapacity = "+newCapacity);

		// ArrayList of Integers
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(20);
		arr.add(10);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		
		System.out.println("ArrayList of integer values : "+arr);
		System.out.println("ArrayList size : "+arr.size());
		System.out.println("ArrayList is empty : "+arr.isEmpty());
		
		System.out.println("Iterate the ArrayList : ");
		Iterator<Integer> iter = arr.iterator();
		while(iter.hasNext()) {
			Integer val = iter.next();
			System.out.print(val+" ");
		}
		
		System.out.println("\nArrayList using foreach loop : ");
		for(int item : arr)
			System.out.print(item+" ");
		
		// ArrayList of Strings
		List<String> arrStr = new ArrayList<String>();
		arrStr.add("Raj");
		arrStr.add("Rekha");
		arrStr.add("Rupesh");
		arrStr.add("Pravin");
		arrStr.add("Saroj");
		
		System.out.println("\n\nArrayList of string values : "+arrStr);
		System.out.println("ArrayList size : "+arrStr.size());
		System.out.println("ArrayList is empty : "+arrStr.isEmpty());
		
		System.out.println("Iterate the ArrayList : ");
		Iterator<String> iterStr = arrStr.iterator();
		while(iterStr.hasNext()) {
			String str = iterStr.next();
			System.out.print(str+" ");
		}
		
		System.out.println("\nArrayList using foreach loop : ");
		for(String str1 : arrStr)
			System.out.print(str1+" ");
		
		// ArrayList of Employee
		List<Employee> arrEmp = new ArrayList<Employee>();
		arrEmp.add(new Employee("A1","Raj",10000.0f));
		arrEmp.add(new Employee("A2","Rekha",20000.0f));
		arrEmp.add(new Employee("A3","Rupesh",30000.0f));
		
		System.out.println("\n\nArrayList of Employee : "+arrEmp);
		System.out.println("ArrayList size : "+arrEmp.size());
		System.out.println("ArrayList is empty : "+arrEmp.isEmpty());
		
		System.out.println("Iterate the ArrayList : ");
		Iterator<Employee> iterEmp = arrEmp.iterator();
		while(iterEmp.hasNext()) {
			Employee emp = iterEmp.next();
			System.out.println(emp);
		}
		
		System.out.println("ArrayList using foreach loop : ");
		for(Employee emp1 : arrEmp)
			System.out.println(emp1);
		
		//addAll() - union
		//retainAll() - intersection
		
	}
}
