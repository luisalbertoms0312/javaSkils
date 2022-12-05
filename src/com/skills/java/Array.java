package com.skills.java;

public class Array {
	public static void main(String[] args) {
		String[] students = {"Luis", "Alberto", "Sussy", "Sheshomaru"};
		int[] numbers = { 1, 2, 3, 4, 5}; 
		 
		System.out.println(students[0]);
		
		
		System.out.println("There are "  + students.length + " students in the class");
		
		for (int i = 0; i < students .length; i++) {
			System.out.println(students[i]);
		}
		
	}

}
