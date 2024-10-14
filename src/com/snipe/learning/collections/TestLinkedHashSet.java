package com.snipe.learning.collections;

import java.util.*; 

public class TestLinkedHashSet {
    public static void main(String[] args)   
    {   
    	// creating LinkedHashSet using the Set  
	    Set<String> data = new LinkedHashSet<String>();   
	    data.add("HP");   
	    data.add("Dell");   
	    data.add("Lenovo"); 
	    data.add("Lenovo"); 
	    data.add(null);
	    data.add(null);
	    System.out.println(data);   // O/P : [HP, Dell, Lenovo, null]
	    
	    ArrayList<String> newData = new ArrayList<String>();   
        newData.add("Java");   
        newData.add("C");   
        newData.add("C++");  
        data.addAll(newData);  
        System.out.println(data);  // O/P : [HP, Dell, Lenovo, null, Java, C, C++]
	}   
}
