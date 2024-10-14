package com.snipe.learning.stringoperation;

public class TestStringBufferAndStringBuilder {
	
	public static void main(String[] args){  
		
        long startTime = System.currentTimeMillis();  
        StringBuffer sb = new StringBuffer("Java");  
        for (int i=0; i<10000; i++){  
            sb.append("World");  
        }  
        System.out.println("Time taken by StringBuffer : " + (System.currentTimeMillis() - startTime) + "ms");  
        
        startTime = System.currentTimeMillis();  
        StringBuilder sb1 = new StringBuilder("Java");  
        for (int i=0; i<10000; i++){  
            sb1.append("World");  
        }  
        System.out.println("Time taken by StringBuilder : " + (System.currentTimeMillis() - startTime) + "ms");  
    }  
}
