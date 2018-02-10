package com.tt.encapsulation2;

import com.tt.encapsulation.EncapsulationConcepts;

public class Encap3to3 extends EncapsulationConcepts {

	public static void main(String[] args) {
		Encap3to3 ec = new Encap3to3();	

		ec.subtraction(100, 10);
		ec.division(100, 10);
		//Subtraction and Division should show up 
		//Because sub is in public and dev is in default.
		
	}

}
