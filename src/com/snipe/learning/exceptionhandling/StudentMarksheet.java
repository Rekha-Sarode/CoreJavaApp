package com.snipe.learning.exceptionhandling;

public class StudentMarksheet {
	public static void main (String[] args) {
		try {
			StudentService student = new StudentServiceImpl();
			student.studentsDetails ();
			student.inputMarks ();
			student.studentsResult ();
		} catch (Exception exception) {
			exception.printStackTrace ();
		}
	}
}
