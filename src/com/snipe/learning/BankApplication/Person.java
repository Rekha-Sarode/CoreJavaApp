package com.snipe.learning.BankApplication;

public class Person {
	private static int accountNumber;
	private static String name;
	private static float depositMoney;
	private static float withdrawMoney;
	private static float balance;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public float getDepositMoney() {
		return depositMoney;
	}
	public void setDepositMoney(float depositMoney) {
		this.depositMoney = depositMoney;
	}
	
	public float getWithdrawMoney() {
		return withdrawMoney;
	}
	public void setWithdrawMoney(float withdrawMoney) {
		this.withdrawMoney = withdrawMoney;
	}
	
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
}
