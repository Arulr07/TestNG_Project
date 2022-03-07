package com.testng.org;

import org.testng.annotations.Test;

public class Innvocation_Count {

	@Test(invocationCount = 3)
	private void searchmobiles() {
		System.out.println("Mobile search completed");
	}
	
	@Test
	private void searchlaptops() {
		System.out.println("Laptop search completed");
	}
	
	@Test(invocationCount = 5)
	private void searchearphoes() {
		System.out.println("earphone search completed");
	}
	
	@Test 
	private void searchkitchenwares() {
		System.out.println("Kitchenware search completed");
	}
	
	@Test(invocationCount = 2)
	private void searchcamera() {
		System.out.println("Camera search completed");
	}
	
	@Test
	private void searchgarments() {
		System.out.println("Garment search completed");
	}

	
}
