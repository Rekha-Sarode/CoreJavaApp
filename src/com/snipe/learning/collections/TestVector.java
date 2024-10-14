package com.snipe.learning.collections;

import java.util.*; 

class TestVector{      
	public static void main(String args[]){  
		Vector v1 = new Vector();
		v1.add(1);
		System.out.println(v1);
		Vector<String> v = new Vector<String>(); 
		System.out.println("Vector capacity after creation is : "+v.capacity()); //O/P - 10
		v.add("Rekha");   //method of Collection 
		for(int i=0; i<10; i++)
			v.addElement("Raj");   //method of Vector  
		System.out.println("Vector capacity after adding elements is : "+v.capacity()); // O/P – 20
		//traversing elements using Enumeration 
		System.out.println("Vector Elements : ");
		Enumeration e = v.elements();  
		while(e.hasMoreElements()){  
			System.out.println(e.nextElement());  
		}  
	}      
}    
