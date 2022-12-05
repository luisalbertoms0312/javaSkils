package com.skills.java;

public class JavaMethods {

	public static void main(String[] args) {
		helloword();
		printHello("Luis Alberto");
		System.out.println(operation(3, 4, 5));
		System.out.println(operation(5, 10, 15));
	}
	
	private static void helloword() {
		System.out.println("Hello World");
	}
	
	private static void printHello(String name) {
		System.out.println("Hello " + name);
	}
	
	
	private static int operation(int num1, int num2, int num3) {
		return (num1 + num2 + num3) / 3;
	}
	
}
