package com.tt.encapsulation;

public class EncapsulationConcepts {
	
	private int sum;
	public int sub;
	int mult;
	protected int dev;

	private void sum(int x, int y) {
	
		sum = x+y;
		System.out.println("Sum is: " + sum);
		
	}
	
	public void subtraction (int x, int y) {
		
		sub = x-y;
	
		System.out.println("Subtraction is: " + sub);
	}
	
	void multiplication (int x, int y) {
		mult = x*y;
		System.out.println("Multiplication is: " + mult);
		
	}
	
	protected void division (int x, int y) {
		
		dev = x/y;
		
		System.out.println("Division is: " + dev);
		
	}
	
	public static void main(String[] args) {
		
		EncapsulationConcepts ec = new EncapsulationConcepts();
		ec.sum(45, 35);
		ec.subtraction(45, 35);
		ec.multiplication(45, 35);
		ec.division(45, 35);
		
	}
	
}
