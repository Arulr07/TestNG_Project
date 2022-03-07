package com.testng.org;

import org.testng.annotations.Test;

public class Group_Test {
	
	@Test(groups = "Electronics")
	private void searchmobile() {
		System.out.println("Mobile search completed");
	}
	
	@Test(groups = "Electronics")
	private void searchearphone() {
		System.out.println("Earphone search completed");
	}
	
	@Test(groups = "Kitchenware")
	private void searchspoon() {
		System.out.println("Spoon search completed");
	}
	
	@Test(groups = "Kitchenware")
	private void searchvessels() {
		System.out.println("Vessel search completed");
	}
	
	@Test(groups = "Stationery")
	private void searchprinter() {
		System.out.println("Printer search completed");
	}
	
	@Test(groups = "Stationery")
	private void searchpen() {
		System.out.println("Pen search completed");
	}

}
