package com.snipe.learning.collections;

import java.util.*;

public class TestTreeMap {
	public static void main(String args[]) {  
	    TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(100,"Amit");    
	      map.put(102,"Ravi");    
	      map.put(101,"Vijay");    
	      map.put(103,"Rahul");    
	      System.out.println("Before invoking remove() method"); 
	      System.out.println(map.entrySet());
	      map.remove(102);      
	      System.out.println("After invoking remove() method");  
	      System.out.println(map.entrySet());
	      //Maintains descending order  
	      System.out.println("descendingMap: "+map.descendingMap());  
	      //Returns key-value pairs whose keys are less than or equal to the specified key.  
	      System.out.println("headMap: "+map.headMap(102,true));  
	      //Returns key-value pairs whose keys are greater than or equal to the specified key.  
	      System.out.println("tailMap: "+map.tailMap(102,true));  
	      //Returns key-value pairs exists in between the specified key.  
	      System.out.println("subMap: "+map.subMap(100, false, 102, true));   
	}  
}
/* O/P : 
Before invoking remove() method
[100=Amit, 101=Vijay, 102=Ravi, 103=Rahul]
After invoking remove() method
[100=Amit, 101=Vijay, 103=Rahul]
descendingMap: {103=Rahul, 101=Vijay, 100=Amit}
headMap: {100=Amit, 101=Vijay}
tailMap: {103=Rahul}
subMap: {101=Vijay}
 */
