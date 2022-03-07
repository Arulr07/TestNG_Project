package com.testng.org;

import org.testng.annotations.Test;

public class Priority_Test {
	
	@Test(priority = -1)
	private void searchmobiles() {
		System.out.println("Mobile search completed");
	}
	
	@Test(priority = 1)
	private void searchlaptops() {
		System.out.println("Laptop search completed");
	}
	
	@Test(priority = -2)
	private void searchearphoes() {
		System.out.println("earphone search completed");
	}
	
	@Test 
	private void searchkitchenwares() {
		System.out.println("Kitchenware search completed");
	}
	
	@Test(priority = 0)
	private void searchcamera() {
		System.out.println("Camera search completed");
	}
	
	@Test(priority = 2)
	private void searchgarments() {
		System.out.println("Garment search completed");
	}


}
