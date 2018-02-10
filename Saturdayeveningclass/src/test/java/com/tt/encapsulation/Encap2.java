package com.tt.encapsulation;

public class Encap2  {
	

	public static void main(String[] args) {
		
		EncapsulationConcepts ec = new EncapsulationConcepts();
		
		//sum is missing because it was in private in class EncapsulationConcepts
		ec.multiplication(100, 10);
		ec.division(100, 10);
		ec.subtraction(100, 10);

	}

}
