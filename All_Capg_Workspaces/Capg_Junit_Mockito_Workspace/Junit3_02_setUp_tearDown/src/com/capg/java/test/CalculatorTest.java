package com.capg.java.test;

import com.capg.java.Calculator;
import junit.framework.TestCase;
public class CalculatorTest extends TestCase{
	
	Calculator calculator;
	
	public void setUp() {
		calculator = new Calculator();
	}
	
	public void testAdd() {
		
		assertEquals(2,calculator.addition(1, 1));
	}
	
	public void tearDown() {
		calculator = null;
	}
}
