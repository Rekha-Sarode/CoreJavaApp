package com.snipe.learning.collections;

import java.util.Stack;

public class TestStack {
	public static void main(String[] args)   
	{  
		Stack st = new Stack();
		System.out.println("Is stack empty : "+st.isEmpty());
		st.push(10);
		st.push("java");
		st.push(null);
		st.push("java");
		System.out.println("Is stack empty : "+st.isEmpty());
		System.out.println("Stack size : "+st.size());
		System.out.println("Stack : "+st);
		System.out.println("Element popped from stack is : "+st.pop());
		System.out.println("Stack : "+st);
		System.out.println("Element from peek is : "+st.peek());
		System.out.println("Stack : "+st);
		
		Stack<String> stk= new Stack<>();  
		stk.push("Mac Book");  
		stk.push("HP");  
		stk.push("DELL");  
		stk.push("Asus");  
		System.out.println("Stack: " + stk);  
		int location = stk.search("HP"); 
		if(location != -1)
			System.out.println("Location of HP: " + location); 
		else 
			System.out.println("Element HP is not there in stack.");
	}  
}
