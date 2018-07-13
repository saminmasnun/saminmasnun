package com.util;

import java.awt.MouseInfo;

import org.testng.annotations.Test;

public class dasda {

	@Test
	public void codetest() throws Throwable {
		
		  while(true != false)
	        {
	       // TimeUnit.SECONDS.sleep(1/2);
	        double mouseX = MouseInfo.getPointerInfo().getLocation().getX();
	        Thread.sleep(6000,000);
	        double mouseY = MouseInfo.getPointerInfo().getLocation().getY();
	        System.out.println("X:" + mouseX);
	        System.out.println("Y:" + mouseY);
	        //make sure to import 
	        }
		
		
	}
}
