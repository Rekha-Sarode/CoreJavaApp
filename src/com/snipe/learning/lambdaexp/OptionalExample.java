package com.snipe.learning.lambdaexp;

import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {  
        String[] str = new String[10];        
        //str[5] = "JAVA OPTIONAL CLASS EXAMPLE";  // Setting value for 5th index  
        Optional<String> checkNull = Optional.ofNullable(str[5]);  
        if(checkNull.isPresent()) {  // It Checks, value is present or not  
            String lowercaseString = str[5].toLowerCase();  
            System.out.println(lowercaseString);  
        } else  
            System.out.println("String value is not present");  
        
        checkNull.ifPresent(val -> System.out.println("Value is present : "+val));
        
        int length = checkNull.map(String::length).orElse(0);
        System.out.println("String length : "+length);
	}
}
