package com.usa.learningjava;

public class Animal4 {
//More prac. 4 (Polymorphism object oriented program method overloading)
	//How to use same method name/signature name?
	
	public void getsalary(int a) {
		System.out.println("This is void method");
		//use any variable (change parameter)
	}
	
	public void getsalary(int a, int b) {
		System.out.println("This is another void method");
	}
	
}
