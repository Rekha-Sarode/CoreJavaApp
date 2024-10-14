package com.snipe.learning.functionalInterface;

import java.util.function.Predicate;  

public class PredicateInterfaceExample {  
	static boolean checkAge(int age){  
        if(age > 18)  
            return true;  
        else 
        	return false;  
    } 

    public static void main(String[] args) {  
        Predicate<Integer> pr = a -> (a > 18); // Creating predicate  
        System.out.println(pr.test(10));    // Calling Predicate method  
        System.out.println(pr.test(20));
        
        Predicate<String> isStrLen = str -> str.length() > 5;
        System.out.println(isStrLen.test("Rekha"));
        System.out.println(isStrLen.test("RekhaSarode"));
        
        Predicate<Integer> predicate =  PredicateInterfaceExample::checkAge;  
        boolean result = predicate.test(25);  
        System.out.println(result);
    }  
}  
