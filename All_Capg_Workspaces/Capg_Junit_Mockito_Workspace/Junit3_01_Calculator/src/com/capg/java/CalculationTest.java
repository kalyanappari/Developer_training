package com.capg.java;

import junit.framework.TestCase;

public class CalculationTest extends TestCase{
	
	public void testAdd() {
		
		Calculator obj = new Calculator();
		
		int result = obj.addition(2,3);
		
		assertEquals(5,result);
	}
	
	public void testAdd1() {
		
		assertEquals(6,new Calculator().multiply(2,4));
	}
}
