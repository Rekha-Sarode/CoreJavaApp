package com.snipe.learning.oops;

interface Alarm {
	default void turnAlarmOn() {
		System.out.println("Turning the alarm on.");
    }
}
interface Vehicle extends Alarm {
	default void turnAlarmOn() {
        System.out.println("Turning the vehicle alarm on.");
    }
}
class Car implements Vehicle {
	/*public void turnAlarmOn() {
		System.out.println("Turning the Car alarm on.");
    }*/
}
public class TestDefaultInterfaceMethod {
	public static void main(String[] args) {
		Car c = new Car();
		c.turnAlarmOn();
	}
}
