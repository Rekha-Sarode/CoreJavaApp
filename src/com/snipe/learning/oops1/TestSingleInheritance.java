package com.snipe.learning.oops1;

class Animal {
	/*Animal() {
		System.out.println("In default Animal constructor");
	}*/
	/*Animal(String name) {
		System.out.println("In parameterised Animal constructor");
	}*/
	void eat() {
		System.out.println("eating..");
	}
}

class Dog extends Animal{
	String name;
	/*Dog() {
		System.out.println("In default Dog constructor");
	}*/
	Dog(String name) {
		this.name = name;
		System.out.println("In parameterised Dog constructor");
	}
	void bark() {
		System.out.println("barking..");
	}
}

public class TestSingleInheritance {
	public static void main(String[] args) {
		Dog dog = new Dog("abc");
		dog.eat();
		dog.bark();
	}
}
