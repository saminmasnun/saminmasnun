package com.tt.encapsulation;

public class AtOverride extends EncapsulationConcepts {
	
	public static void main(String[] args) {
		
		EncapsulationConcepts ec = new EncapsulationConcepts();
		ec.subtraction(100, 10);

	}
	
	
	@Override
	public void subtraction (int x, int y) {
		sub = x-y;
		System.out.println("Subtraction is: " + sub);
	}

}

