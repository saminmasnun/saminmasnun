package com.usa.learningjava;

public class Animal {

	//Package name = learningjava
	//Class name = Animal	
	// Method starts from and finishes with {}
	//method name here = void
	public void salary() {
		System.out.println("Hello World");
		//here salary = signature
		// only signatur (no body/coding) = abstract method
	}
	//signature can not be the same = use income instead
	//method name here = static (void)
public static void income() {
	System.out.println("Hello All");	
}

//int = data type
//method name here = static (not void)
public static int getsalary() {
	System.out.println("Hi All");
	return 0;
	//use return = when void is not used
}

// Java can not run codes without main method
//String = data type
//method name here = main
public static void main(String[] args) {
	Animal obj = new Animal();
	//Use class name and use obj (any object name) to call public void in main method 
	
	//Use 'object_name.' to call public void in main method
	obj.salary();
	
	// can not call income the same way, bcoz income is class level.
	// use 'class_name.' instead
	Animal.income();
	Animal.getsalary();
}
	
}