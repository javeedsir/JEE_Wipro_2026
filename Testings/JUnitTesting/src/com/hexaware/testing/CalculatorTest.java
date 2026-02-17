package com.hexaware.testing;



import static  java.lang.System.out;

import  static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.hexaware.app.Calculator;

class CalculatorTest {
	
	static Calculator  c;
	
	@BeforeAll
	public static void m1() {
		
		System.out.println("Before All executed..");
		
		c = new Calculator();
		
		// reading file
		// getting DB connection
		// creating objects
		// intializing values
		
	}
	
	@AfterAll
	public static void m2() {
		
		System.out.println("After All executed...");
		
		// closing connection
		// closing file
		// cleaning memory or objects
		
	}
	
	@BeforeEach
	public void  beforeEach() {
		
		
		System.out.println("Before Each method called..");
		
	}
	
	
	@AfterEach
	public void afterEach() {
		
		System.out.println("After Each method is called..");
		
	}
	

	@Test
	@DisplayName("Add Test")
	void testAdd() {
		
	
		
		int actual =	c.add(4, 15);
		
		assertEquals(19, actual);
		
		
		out.println("add test executed..");
	
		
	}

	@Test
	@DisplayName("Sub Test")
	void testSub() {
		
		
		
		int n =		c.sub(10, 5);
		
		assertEquals(5, n);
			assertTrue(n > 0);
	
	
			out.println("sub test executed...");
	
	}

	@Test
	void testMul() {
		
	
		
		assertNotNull(c);
		
		assertNotEquals(10, c.mul(5, 4));
		
		out.println("mul test executed...");
		
	}

	@Test
	@Disabled
	void testDiv() {
		
	
		
		assertEquals(12, c.div(10, 5), "div is tested");
		
		
	}

}
