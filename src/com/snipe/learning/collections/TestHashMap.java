package com.snipe.learning.collections;

//Non-generic  (old style)
import java.util.*;  
		
public class TestHashMap {
	public static void main(String[] args) {  
	    Map map=new HashMap();  
	    map.put(1,"Amit");  
	    map.put(5,"Rahul");  
	    map.put(2,"Jai");  
	    map.put(2,"Amit");  
	    Set set=map.entrySet(); //Converting to Set so that we can traverse  
	    Iterator itr=set.iterator();  
	    while(itr.hasNext()){  
	        //Converting to Map.Entry so that we can get key and value separately  
	        Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
	    }  
	}  
}
/* O/P : 1 Amit
 * 		 2 Amit
 * 		 5 Rahul  */ 
