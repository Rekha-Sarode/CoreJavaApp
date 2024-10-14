package com.snipe.learning.fundamentals;
 
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1=0, n2=1, n3, i, count;
		
		System.out.println("Enter the number of terms in fibonacci series (more than 2): ");
		count = scanner.nextInt();
		System.out.println("The fibonacci series is : ");
		if(count >= 2) 
			System.out.print(n1+" "+n2);
		for(i=2; i<count; i++) {
			n3 = n1 + n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
		}
		
		scanner.close();
	}

}
