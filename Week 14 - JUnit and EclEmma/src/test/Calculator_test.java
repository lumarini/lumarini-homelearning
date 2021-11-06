package test;

import static org.junit.Assert.*;
import org.junit.Test;
import calculator.Calculator;

public class Calculator_test {

	@Test      //annotation
	public void test_sum() {
		
		int a = 4;
		int b = 6;
		int expected = 10;
		int actual = Calculator.sum(a, b);
		assertEquals(expected, actual);
	}
	
	@Test      //annotation
	public void test_subtract() {
		
		int a = 6;
		int b = 4;
		int expected = 2;
		int actual = Calculator.subtract(a, b);
		assertEquals(expected, actual);	
	}
	
	@Test      //annotation
	public void test_multipy() {
		
		int a = 4;
		int b = 2;
		int expected = 8;
		int actual = Calculator.multiply(a, b);
		assertEquals(expected, actual);	
	}
	
	
	@Test      //annotation
	public void test_divide() {
		
		int a = 10;
		int b = 4;
		int expected = 2;
		int actual = Calculator.divide(a, b);
		assertEquals(expected, actual);	
	}


}
