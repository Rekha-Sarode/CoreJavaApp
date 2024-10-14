package com.snipe.learning.collections1;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TestHashtable {
	public static void main(String args[]){  
	    Map<Integer,String> map = new Hashtable<Integer,String>();          
	    map.put(100,"INDIA");    
	    map.put(102,"SRILANKA");   
	    map.put(101,"RUSSIA");    
	    map.put(103,"AUSTRALIA"); 
	    System.out.println("Hashtable : "+map); 
	     
	    System.out.println("Hashtable using iterator : "); 
	    Iterator iter = map.entrySet().iterator();
	    while(iter.hasNext()) {
	    	Entry<Integer,String> item = (Entry<Integer,String>) iter.next();
	    	System.out.println(item.getKey() + ":" + item.getValue()); 
	    }
	    
	    System.out.println("Hashtable using foreach : "); 
	    for(Entry<Integer,String> m:map.entrySet()) {  
	    	System.out.println(m.getKey()+" "+m.getValue());  
	    } 
	    
	    System.out.println("Hashtable using Lambda : ");
	    map.forEach((K,v)->{System.out.println(K+" :: "+v);});
	 }
}
