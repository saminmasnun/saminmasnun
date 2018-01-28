package com.usa.learningjava;

public class Animal4 {
//More prac. 4 (Polymorphism object oriented program method overloading)
	//How to use same method name/signature name?
	
	public void getsalary(int a) {
		System.out.println("This is void method");
		//use any variable (inside parameter)
	}
	
	public void getsalary(int a, double b) {
		System.out.println("This is another void method");
		//use any variable (but change parameter)
		
	}
	
	public void getsalary(double b, int a) {
		System.out.println("This is another void method");
	
	//How to change the parameter?
	
		// 1. Change the number of the parameter.
		// 2. Change the data type of the parameter.
		// 3. Change the position of the parameter with different data type.
	
	//This is called Overloading
}
	
}