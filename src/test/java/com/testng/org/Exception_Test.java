package com.testng.org;

import org.testng.annotations.Test;

public class Exception_Test {
	
	@Test
	private void add() {
		
		int i = 10;
		int j = 20;
		
		System.out.println("add: " + (i+j));
	}
	
	@Test(expectedExceptions = ArithmeticException.class )
	private void divide() {
		
		int a = 10;
		int b = 0;
		
		System.out.println("divide : " +(a/b));
		
	}

}
