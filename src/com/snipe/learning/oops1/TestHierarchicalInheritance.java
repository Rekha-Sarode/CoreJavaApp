package com.snipe.learning.oops1;

public class TestHierarchicalInheritance {
	public static void main(String[] args) {
		 FTEmployee ftEmployee = new FTEmployee("Rekha", "Sarode", "A001", "MD",100000000.0);
		 ftEmployee.display();
		 PTEmployee pEmployee = new PTEmployee("Neha", "Sharma", "A002", "admin", 800000.0);
		 pEmployee.display(); 
	}
}
