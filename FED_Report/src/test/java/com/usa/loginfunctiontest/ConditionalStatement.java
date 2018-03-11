package com.usa.loginfunctiontest;

public class ConditionalStatement {

	static int salary;
	
	public static void main(String[] args) {
		
		salary = 10000;
		
		if(salary != 10000) {
			
			System.out.println("poor salary");
		}
		
		else if (salary == 10000) {
			
			System.out.println("good salary");
		}
		
		else {
			
			System.out.println("something else");
			
		}

	}

}
