package com.snipe.learning.collections;

import java.util.*;

public class TestHashtable {
	public static void main(String args[]){  
	    Hashtable<Integer,String> map=new Hashtable<Integer,String>();          
	     map.put(100,"Amit");    
	     map.put(102,"Ravi");   
	     map.put(101,"Vijay");    
	     map.put(103,"Rahul"); 
	     System.out.println(map.getOrDefault(101, "Not Found"));  
	     System.out.println(map.getOrDefault(105, "Not Found")); 
	     System.out.println("Initial Map: "+map);  
	     map.putIfAbsent(104,"Gaurav");  
	     System.out.println("Updated Map: "+map);  
	     map.putIfAbsent(101,"OM");  
	     System.out.println("Updated Map: "+map);  
	     map.put(101,"OM");  
	     System.out.println("Updated Map: "+map); 
	 }  
}
/* O/P :
Vijay
Not Found
Initial Map: {103=Rahul, 102=Ravi, 101=Vijay, 100=Amit}
Updated Map: {104=Gaurav, 103=Rahul, 102=Ravi, 101=Vijay, 100=Amit}
Updated Map: {104=Gaurav, 103=Rahul, 102=Ravi, 101=Vijay, 100=Amit}
Updated Map: {104=Gaurav, 103=Rahul, 102=Ravi, 101=OM, 100=Amit}
 */
