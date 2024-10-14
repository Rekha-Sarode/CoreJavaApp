package com.snipe.learning.oops;

abstract class Person{  
	int data = 10;
	abstract void eat();  
}

class TestAnonymousInner { 
	private int value = 20;
	static int svalue = 30;
	public void display() {
		Person p=new Person() {  
			//int data = 11;
			//int value = 22;
			//int svalue = 33;
			void eat() { 
				data = 11;
				svalue = 33;
				value=22;
				System.out.println("variable data = "+data);
				System.out.println("variable value = "+value); 
				System.out.println("variable svalue = "+svalue); 
			}  
		};
		p.eat();
	}
	public static void main(String args[]) {  
		/*Person p=new Person() {  
			//int data = 11;
			//int value = 22;
			//int svalue = 33;
			void eat() { 
				data = 11;
				svalue = 33;
				System.out.println("variable data = "+data);
				// System.out.println("variable value = "+value); // Error : Cannot access non-static
				System.out.println("variable svalue = "+svalue); 
			}  
		};  */
		TestAnonymousInner p = new TestAnonymousInner();
		p.display();  
	}  
}  