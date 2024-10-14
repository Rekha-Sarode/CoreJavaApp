package com.snipe.learning.BankApplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Menu extends BankServiceImp {
	
	void menu() throws Exception {
		int choice;
		BufferedReader buffer = new BufferedReader (new InputStreamReader (System.in));
		
		System.out.print ("\n Menu");
		System.out.print ("\n\t 1:> Deposit \n\t 2:> Withdraw \n\t "
				+ "3:> Display Account Information \n\t 4:> Exit \n");
		System.out.println ("\n Enter your choice : ");
		
		choice = Integer.parseInt(buffer.readLine());
		
		switch (choice) {
			case 1:
				// Calling to deposit money in the account
				deposit();
				// Calling to once again go to main menu for choosing other options
				menu ();
			case 2:
				// Calling to withdraw money from the account
				withdraw ();
				// Calling to once again go to main menu for choosing other options
				menu ();
			case 3:
				// Calling to display the account information
				displayBalance ();
				// Calling to once again go to main menu for choosing other options
				menu();
			case 4:
				System.exit (0);
		}
	}
}
