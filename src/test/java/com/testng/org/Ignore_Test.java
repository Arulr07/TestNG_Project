package com.testng.org;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Test {
	
	@Test
	private void searchmobiles() {
		System.out.println("Mobile search completed");
	}
	
	@Ignore
	@Test
	private void searchlaptops() {
		System.out.println("Laptop search completed");
	}
	
	@Test(enabled = false)
	private void searchearphoes() {
		System.out.println("earphone search completed");
	}
	
	@Test 
	private void searchkitchenwares() {
		System.out.println("Kitchenware search completed");
	}
	
	@Test
	private void searchcamera() {
		System.out.println("Camera search completed");
	}
	
	@Test
	private void searchgarments() {
		System.out.println("Garment search completed");
	}
	

}
