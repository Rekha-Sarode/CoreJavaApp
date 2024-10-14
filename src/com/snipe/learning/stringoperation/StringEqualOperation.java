package com.snipe.learning.stringoperation;

// Difference between == and equals operator of String

public class StringEqualOperation {
	public static void main (String args[]) {
		String firstString = "Rekha";
		String secondString = "Rekha";
		if (firstString == secondString)
			System.out.println ("firstString == secondString");
		if (firstString.equals(secondString))
			System.out.println ("firstString is equal to secondString");
		
		String thirdString = new String ("Rekha");
		String fourthString = new String ("Rekha");
		if (thirdString == fourthString)
			System.out.println ("thirdString == fourthString");		
		if (thirdString.equals(fourthString)) {
			System.out.println ("thirdString is equal to fourthString");
		}
		
		if (firstString == thirdString)
			System.out.println ("firstString == thirdString");
		if (firstString.equals(thirdString))
			System.out.println ("firstString is equal to thirdString");
	}
}
