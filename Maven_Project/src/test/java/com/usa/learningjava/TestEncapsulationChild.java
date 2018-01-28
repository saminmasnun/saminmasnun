package com.usa.learningjava;

public class TestEncapsulationChild extends TestEncapsulation {

	// from parent class
	
	public static void main(String[] args) {
		
		TestEncapsulationChild obj = new TestEncapsulationChild();
		obj.getA();
		obj.setA(10);
		System.out.println(obj.getA());
		
		//We can call again with a different value if we want
		obj.getA();
		obj.setA(20);
		System.out.println(obj.getA());
		
	}
	
	//print method should either in parent or child.
	// The value should be in set method.
	// To get and print - use print_ln and put 'get' inside.
	
}
