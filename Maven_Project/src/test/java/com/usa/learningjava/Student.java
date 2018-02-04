package com.usa.learningjava;

public class Student {
	
	// Instance variable goes here
	// If the word Static used then it becomes Static variable or class level variable
	
	String boyName = "Rayhan";
	String girlName = "Pinki";
	
	static int boySalary = 1000;
	static int girlSalary = 1200;
	
	public void getname(String name) {
		
		System.out.println(boySalary);
		System.out.println(girlSalary);
		
		//local variable goes here
		int age;
	}
	
	public static void getsalary(int salary) {
		
		System.out.println(boySalary);
		System.out.println(girlSalary);
		
	}
	
	public static void main(String[] args) {
		
		// to create any object: class_name obj = new class_name();
		Student boy = new Student();
		Student girl = new Student();
		
	}

}

