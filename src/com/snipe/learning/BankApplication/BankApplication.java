package com.snipe.learning.BankApplication;

/* Purpose : Demonstrate a Bank Application 
   1.Create an Account 2. Deposit 3. Withdraw and 4. Display the account details 
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankApplication {
	public static void main (String[] args) {
		try {
			String input, name;
			int accountNumber;
			float balance;
			boolean check = false;
			Person assign = new Person ();
			Menu menu = new Menu ();
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print (" Enter the account number : ");
			input = buffer.readLine ();
			accountNumber = Integer.parseInt (input);
			assign.setAccountNumber (accountNumber);
			System.out.print (" Enter the name : ");
			name = buffer.readLine ();
			assign.setName (name);
			
			do {
				System.out.print (" Deposit minimum account balance : ");
				balance = Float.parseFloat (buffer.readLine ());
				if (balance < 1000) {
					check = true;
					System.out.println (" Minimum balance must be Rs.1000");
				} else
					check = false;
			} while (check == true);
			
			assign.setBalance (balance);
			menu.menu ();
		} catch (Exception exception) {
			exception.printStackTrace ();
		}
	}
}
