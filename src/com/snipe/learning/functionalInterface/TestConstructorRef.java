package com.snipe.learning.functionalInterface;

import java.util.function.Function;

class Person {
	private String name;
	private int age;
	public Person(String name) {
		super();
		this.name = name;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
}

public class TestConstructorRef {
	public static void main(String[] args) {
		Function<String, Person> personFactory = Person::new;
		Person person = personFactory.apply("Rekha");
		personFactory = name -> new Person(name, 30);
		Person person1 = personFactory.apply("Neha");
		System.out.println("Person : "+person.getName()+" : "+person.getAge());
		System.out.println("Person1 : "+person1.getName()+" : "+person1.getAge());
	}
}
