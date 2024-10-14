package com.snipe.learning.collections;

import java.util.TreeSet;
import java.util.Set;

public class TestTreeSet {
	 public static void main(String[] args)   
	 {   
		    TreeSet<String> data = new TreeSet<String>();   
		    data.add("HP");   
		    data.add("Dell");   
		    data.add("Lenovo"); 
		    data.add("Lenovo"); 
		    //data.add(null);   // NullPointerException
		    System.out.println(data);  
	 }
}
