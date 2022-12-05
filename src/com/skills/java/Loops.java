package com.skills.java;

public class Loops {
	
	public static void main(String[] args) {
		//Normal For
		int pages = 10;
		for (int i = 0; i <= pages; i++) {
			System.out.println(i);
			
		}
		
		
		//ForEach
		String[] students = {"Luis", "Alberto", "Mendez", "Suarez"};
		for (String st : students) {
			System.out.println(st);
			
		}
	}

}