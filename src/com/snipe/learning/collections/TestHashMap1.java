package com.snipe.learning.collections;

// Generic  (new style)
import java.util.*;  
		
public class TestHashMap1 {
	public static void main(String[] args) {  
		Map<Integer,String> map=new HashMap<Integer,String>();   
	    map.put(1,"Amit");  
	    map.put(5,"Rahul");  
	    map.put(2,"Jai");  
	    //Elements can traverse in any order  
	    for(Map.Entry m:map.entrySet()){  
	    	System.out.println(m.getKey()+" "+m.getValue());  
	    } 
	    // Using Lambda
	    map.forEach((K,v)->{System.out.println(K+" :: "+v);});
	}  
}
